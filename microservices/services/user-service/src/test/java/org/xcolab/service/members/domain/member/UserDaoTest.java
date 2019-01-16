package org.xcolab.service.members.domain.member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.OverrideAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.xcolab.model.tables.pojos.User;
import org.xcolab.service.utils.PaginationHelper;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@OverrideAutoConfiguration(enabled = false)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@ComponentScan("org.xcolab.service.members")
@ComponentScan("org.xcolab.client.tracking")
@ActiveProfiles("test")
public class UserDaoTest {

    @Autowired
    private UserDao memberDao;

    @Test
    public void testFindByGiven__shouldReturnRightCount() {
        final List<User> members =
                memberDao.findByGiven(PaginationHelper.EVERYTHING, null, null,
                        null, null, null, null, null, null, null, null);
        assertEquals("Wrong number of members", 2, members.size());
    }

    @Test
    public void testFindByNameGiven() {
        final List<User> members =
                memberDao.findByGiven(PaginationHelper.EVERYTHING, "admin", null,
                        null, null, null, null, null, null, null, null);
        assertEquals("Wrong number of members with name:admin", 1, members.size());
    }

    @Test
    public void testFindByNameGiven_with_roles() {
        final List<User> members =
                memberDao.findByGiven(PaginationHelper.EVERYTHING, null, null,
                        "Member", null, null, null, null, null, null, null);
        assertEquals("Wrong number of members with role:User", 2, members.size());
    }
}