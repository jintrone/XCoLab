/**
 * This class is generated by jOOQ
 */
package org.xcolab.client.sharedcolab.pojo;


import org.springframework.core.ParameterizedTypeReference;

import org.xcolab.util.http.client.types.TypeProvider;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SharedContest implements Serializable {


    public static final TypeProvider<SharedContest> TYPES =
            new TypeProvider<>(SharedContest.class,
                    new ParameterizedTypeReference<List<SharedContest>>() {
                    });
    private static final long serialVersionUID = -997741624;

    private Long      sharedcontestid;
    private String    contestname;
    private Timestamp createdate;
    private String    colaborigin;

    public SharedContest() {}

    public SharedContest(SharedContest value) {
        this.sharedcontestid = value.sharedcontestid;
        this.contestname = value.contestname;
        this.createdate = value.createdate;
        this.colaborigin = value.colaborigin;
    }

    public SharedContest(
        Long      sharedcontestid,
        String    contestname,
        Timestamp createdate,
        String    colaborigin
    ) {
        this.sharedcontestid = sharedcontestid;
        this.contestname = contestname;
        this.createdate = createdate;
        this.colaborigin = colaborigin;
    }

    public Long getSharedContestId() {
        return this.sharedcontestid;
    }

    public void setSharedContestId(Long sharedcontestid) {
        this.sharedcontestid = sharedcontestid;
    }

    public String getContestName() {
        return this.contestname;
    }

    public void setContestName(String contestname) {
        this.contestname = contestname;
    }

    public Timestamp getCreateDate() {
        return this.createdate;
    }

    public void setCreateDate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getColabOrigin() {
        return this.colaborigin;
    }

    public void setColabOrigin(String colaborigin) {
        this.colaborigin = colaborigin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SharedContest other = (SharedContest) obj;
        if (sharedcontestid == null) {
            if (other.sharedcontestid != null)
                return false;
        }
        else if (!sharedcontestid.equals(other.sharedcontestid))
            return false;
        if (contestname == null) {
            if (other.contestname != null)
                return false;
        }
        else if (!contestname.equals(other.contestname))
            return false;
        if (createdate == null) {
            if (other.createdate != null)
                return false;
        }
        else if (!createdate.equals(other.createdate))
            return false;
        if (colaborigin == null) {
            if (other.colaborigin != null)
                return false;
        }
        else if (!colaborigin.equals(other.colaborigin))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sharedcontestid == null) ? 0 : sharedcontestid.hashCode());
        result = prime * result + ((contestname == null) ? 0 : contestname.hashCode());
        result = prime * result + ((createdate == null) ? 0 : createdate.hashCode());
        result = prime * result + ((colaborigin == null) ? 0 : colaborigin.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SharedContest (");

        sb.append(sharedcontestid);
        sb.append(", ").append(contestname);
        sb.append(", ").append(createdate);
        sb.append(", ").append(colaborigin);

        sb.append(")");
        return sb.toString();
    }
}