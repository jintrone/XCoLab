package org.xcolab.service.contest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.xcolab.client.contest.pojo.IFocusAreaOntologyTerm;
import org.xcolab.client.contest.pojo.IImpactDefaultSeries;
import org.xcolab.client.contest.pojo.IImpactDefaultSeriesData;
import org.xcolab.client.contest.pojo.IImpactTemplateFocusAreaList;
import org.xcolab.client.contest.pojo.IImpactTemplateMaxFocusArea;
import org.xcolab.client.contest.pojo.wrapper.FocusAreaWrapper;
import org.xcolab.client.contest.pojo.wrapper.OntologySpaceWrapper;
import org.xcolab.client.contest.pojo.wrapper.OntologyTermWrapper;
import org.xcolab.commons.spring.web.annotation.ListMapping;
import org.xcolab.service.contest.domain.focusarea.FocusAreaDao;
import org.xcolab.service.contest.domain.focusareaontologyterm.FocusAreaOntologyTermDao;
import org.xcolab.service.contest.domain.impactdefaultseries.ImpactDefaultSeriesDao;
import org.xcolab.service.contest.domain.impactdefaultseriesdata.ImpactDefaultSeriesDataDao;
import org.xcolab.service.contest.domain.impacttemplatefocusarealist.ImpactTemplateFocusAreaListDao;
import org.xcolab.service.contest.domain.impacttemplatemaxfocusarea.ImpactTemplateMaxFocusAreaDao;
import org.xcolab.service.contest.domain.ontologyspace.OntologySpaceDao;
import org.xcolab.service.contest.domain.ontologyterm.OntologyTermDao;
import org.xcolab.service.contest.exceptions.NotFoundException;
import org.xcolab.service.contest.service.ontology.OntologyService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OntologyController {

    @Autowired
    private OntologyTermDao ontologyTermDao;

    @Autowired
    private OntologySpaceDao ontologySpaceDao;

    @Autowired
    private FocusAreaDao focusAreaDao;

    @Autowired
    private FocusAreaOntologyTermDao focusAreaOntologyTermDao;

    @Autowired
    private ImpactDefaultSeriesDao impactDefaultSeriesDao;

    @Autowired
    private ImpactDefaultSeriesDataDao impactDefaultSeriesDataDao;

    @Autowired
    private OntologyService ontologyService;

    @ListMapping("/ontologyTerms/getAllOntologyTermDescendant")
    public List<OntologyTermWrapper> getOntologyTerms(@RequestParam Long ontologyTermId)
            throws NotFoundException {
        OntologyTermWrapper ontologyTerm = ontologyTermDao.get(ontologyTermId);
        return ontologyService.getAllOntologyTermDescendantTerms(ontologyTerm);
    }

    @ListMapping("/ontologyTerms/getOntologyTermsByFocusAreaOntologySpaceName")
    public List<OntologyTermWrapper> getOntologyTermsByFocusAreaOntologySpaceName(
            @RequestParam Long focusAreaId, @RequestParam String ontologySpaceName) {
        return ontologyTermDao
                .getOntologyTermByFocusAreaAndOntologySpaceName(focusAreaId, ontologySpaceName);
    }

    @ListMapping("/ontologyTerms")
    public List<OntologyTermWrapper> getOntologyTerms(@RequestParam(required = false) String name,
            @RequestParam(required = false) Long parentId,
            @RequestParam(required = false) Long ontologySpaceId) {
        return ontologyTermDao.findByGiven(name, parentId, ontologySpaceId);
    }

    @GetMapping("/ontologyTerms/{ontologyTermId}")
    public OntologyTermWrapper getOntologyTerm(@PathVariable("ontologyTermId") Long ontologyTermId)
            throws NotFoundException {
        if (ontologyTermId == null || ontologyTermId == 0) {
            throw new NotFoundException("No ontologyTermId given");
        } else {
            return ontologyTermDao.get(ontologyTermId);
        }
    }

    @PutMapping("/ontologyTerms/{id}")
    public boolean updateOntologyTerm(@RequestBody OntologyTermWrapper ontologyTerm,
            @PathVariable("id") Long id) throws NotFoundException {

        if (id == null || id == 0 || ontologyTermDao.get(id) == null) {
            throw new NotFoundException("No OntologyTerm with id " + id);
        } else {
            return ontologyTermDao.update(ontologyTerm);
        }
    }

    @DeleteMapping("/ontologyTerms/{id}")
    public String deleteOntologyTerm(@PathVariable("id") Long id)
            throws NotFoundException {

        if (id == null || id == 0) {
            throw new NotFoundException("No OntologyTerm with id given");
        } else {
            OntologyTermWrapper ontologyTerm = this.ontologyTermDao.get(id);
            if (ontologyTerm != null) {
                this.ontologyTermDao.delete(ontologyTerm.getId());
                return "OntologyTerm deleted successfully";
            } else {
                throw new NotFoundException("No OntologyTerm with id given");
            }
        }
    }

    @PostMapping("/ontologyTerms")
    public OntologyTermWrapper createOntologyTerm(@RequestBody OntologyTermWrapper ontologyTerm) {
        return this.ontologyTermDao.create(ontologyTerm);
    }

    @GetMapping("/focusAreas/{focusAreaId}")
    public FocusAreaWrapper getFocusArea(@PathVariable("focusAreaId") Long focusAreaId)
            throws NotFoundException {
        /*
        if(focusAreaId == 0 ){
            focusAreaId = 2l; //This is done because a lot of old contests use focus area id = 0
            that the auto increment no longer allows.
        }
        if (focusAreaId == null ) {
            throw new NotFoundException("No focusAreaId given");
        } else {
            return focusAreaDao.get(focusAreaId);
        }
        */
        return focusAreaDao.get(focusAreaId);
    }

    @ListMapping("/focusAreas")
    public List<FocusAreaWrapper> getFocusAreas(
            @RequestParam(required = false) Long ontologyTermId) throws NotFoundException {
        List<FocusAreaWrapper> focusAreas = new ArrayList<>();
        for (IFocusAreaOntologyTerm term : focusAreaOntologyTermDao
                .findByGiven(null, ontologyTermId)) {
            focusAreas.add(focusAreaDao.get(term.getFocusAreaId()));
        }
        return focusAreas;
    }

    @PostMapping("/focusAreas")
    public FocusAreaWrapper createFocusArea(@RequestBody FocusAreaWrapper focusArea) {
        return this.focusAreaDao.create(focusArea);
    }

    @PutMapping("/focusAreas/{id}")
    public boolean updateFocusArea(@RequestBody FocusAreaWrapper focusArea,
            @PathVariable("id") Long id) throws NotFoundException {
        if (id == null || id == 0 || focusAreaDao.get(id) == null) {
            throw new NotFoundException("No FocusArea with id " + id);
        } else {
            return focusAreaDao.update(focusArea);
        }
    }


    @DeleteMapping("/focusAreas/{id}")
    public String deleteFocusArea(@PathVariable("id") Long id)
            throws NotFoundException {

        if (id == null || id == 0) {
            throw new NotFoundException("No FocusArea with id given");
        } else {
            FocusAreaWrapper focusArea = this.focusAreaDao.get(id);
            if (focusArea != null) {
                this.focusAreaDao.delete(focusArea.getId());
                return "FocusArea deleted successfully";
            } else {
                throw new NotFoundException("No FocusArea with id given");
            }
        }
    }

    @DeleteMapping("/focusAreaOntologyTerms/deleteFocusAreaOntologyTerm")
    public String deleteFocusAreaOntologyTerm(@RequestParam("focusAreaId") Long focusAreaId,
            @RequestParam Long ontologyTermId)
            throws NotFoundException {

        if (focusAreaId == null || focusAreaId == 0) {
            throw new NotFoundException("No FocusAreaOntologyTerm with id given");
        } else {
            this.focusAreaOntologyTermDao
                    .deleteAllFocusAreasOntologyTerms(focusAreaId, ontologyTermId);
            return "FocusAreaOntologyTerm deleted successfully";
        }
    }

    @ListMapping("/ontologySpaces")
    public List<OntologySpaceWrapper> getOntologySpaces() {
        return ontologySpaceDao.findByGiven();
    }

    @ListMapping("/focusAreaOntologyTerms")
    public List<IFocusAreaOntologyTerm> getFocusAreaOntologyTerms(
            @RequestParam(required = false) Long focusAreaId,
            @RequestParam(required = false) Long ontologTermId) {
        return focusAreaOntologyTermDao.findByGiven(focusAreaId, ontologTermId);
    }

    @PostMapping("/focusAreaOntologyTerms")
    public IFocusAreaOntologyTerm createFocusAreaOntologyTerm(@RequestBody
            IFocusAreaOntologyTerm focusAreaOntologyTerm) {
        return this.focusAreaOntologyTermDao.create(focusAreaOntologyTerm);
    }


    @GetMapping("/ontologySpaces/{ontologySpaceId}")
    public OntologySpaceWrapper getOntologySpace(
            @PathVariable("ontologySpaceId") Long ontologySpaceId) throws NotFoundException {
        if (ontologySpaceId == null || ontologySpaceId == 0) {
            throw new NotFoundException("No ontologySpaceId given");
        } else {
            return ontologySpaceDao.get(ontologySpaceId);
        }
    }

    @ListMapping("/impactDefaultSeries")
    public List<IImpactDefaultSeries> getImpactDefaultSeries(
            @RequestParam(required = false) Long focusAreaId,
            @RequestParam(required = false) String name) {
        return impactDefaultSeriesDao.findByGiven(focusAreaId, name);
    }

    @ListMapping("/impactDefaultSeriesDatas")
    public List<IImpactDefaultSeriesData> getImpactDefaultSeriesDatas(
            @RequestParam(required = false) Long seriesId,
            @RequestParam(required = false) Integer year) {
        return impactDefaultSeriesDataDao.findByGiven(seriesId, year);
    }
}
