package com.ext.portlet.service.base;

import com.ext.portlet.service.DiscussionCategoryLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DiscussionCategoryLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName534;
    private String[] _methodParameterTypes534;
    private String _methodName535;
    private String[] _methodParameterTypes535;
    private String _methodName540;
    private String[] _methodParameterTypes540;
    private String _methodName541;
    private String[] _methodParameterTypes541;
    private String _methodName542;
    private String[] _methodParameterTypes542;
    private String _methodName543;
    private String[] _methodParameterTypes543;
    private String _methodName544;
    private String[] _methodParameterTypes544;
    private String _methodName545;
    private String[] _methodParameterTypes545;
    private String _methodName546;
    private String[] _methodParameterTypes546;
    private String _methodName547;
    private String[] _methodParameterTypes547;
    private String _methodName548;
    private String[] _methodParameterTypes548;
    private String _methodName549;
    private String[] _methodParameterTypes549;
    private String _methodName550;
    private String[] _methodParameterTypes550;

    public DiscussionCategoryLocalServiceClpInvoker() {
        _methodName0 = "addDiscussionCategory";

        _methodParameterTypes0 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName1 = "createDiscussionCategory";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteDiscussionCategory";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteDiscussionCategory";

        _methodParameterTypes3 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchDiscussionCategory";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getDiscussionCategory";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getDiscussionCategories";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getDiscussionCategoriesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateDiscussionCategory";

        _methodParameterTypes15 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName534 = "getBeanIdentifier";

        _methodParameterTypes534 = new String[] {  };

        _methodName535 = "setBeanIdentifier";

        _methodParameterTypes535 = new String[] { "java.lang.String" };

        _methodName540 = "getCategoriesByCategoryGroupId";

        _methodParameterTypes540 = new String[] { "long" };

        _methodName541 = "getDiscussionCategoryById";

        _methodParameterTypes541 = new String[] { "long" };

        _methodName542 = "createDebateCategory";

        _methodParameterTypes542 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "com.liferay.portal.model.User"
            };

        _methodName543 = "getThreads";

        _methodParameterTypes543 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName544 = "addThread";

        _methodParameterTypes544 = new String[] {
                "com.ext.portlet.model.DiscussionCategory", "java.lang.String",
                "java.lang.String", "com.liferay.portal.model.User"
            };

        _methodName545 = "store";

        _methodParameterTypes545 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName546 = "getAuthor";

        _methodParameterTypes546 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName547 = "getLastActivityAuthor";

        _methodParameterTypes547 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName548 = "delete";

        _methodParameterTypes548 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };

        _methodName549 = "update";

        _methodParameterTypes549 = new String[] {
                "com.ext.portlet.model.DiscussionCategory", "java.lang.String",
                "java.lang.String"
            };

        _methodName550 = "getCategoryGroup";

        _methodParameterTypes550 = new String[] {
                "com.ext.portlet.model.DiscussionCategory"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.addDiscussionCategory((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.createDiscussionCategory(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.deleteDiscussionCategory(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.deleteDiscussionCategory((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.fetchDiscussionCategory(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getDiscussionCategory(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getDiscussionCategories(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getDiscussionCategoriesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.updateDiscussionCategory((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName534.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes534, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName535.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes535, parameterTypes)) {
            DiscussionCategoryLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName540.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes540, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getCategoriesByCategoryGroupId(((Long) arguments[0]).longValue());
        }

        if (_methodName541.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes541, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getDiscussionCategoryById(((Long) arguments[0]).longValue());
        }

        if (_methodName542.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes542, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.createDebateCategory(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (com.liferay.portal.model.User) arguments[3]);
        }

        if (_methodName543.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes543, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getThreads((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName544.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes544, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.addThread((com.ext.portlet.model.DiscussionCategory) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (com.liferay.portal.model.User) arguments[3]);
        }

        if (_methodName545.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes545, parameterTypes)) {
            DiscussionCategoryLocalServiceUtil.store((com.ext.portlet.model.DiscussionCategory) arguments[0]);

            return null;
        }

        if (_methodName546.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes546, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getAuthor((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName547.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes547, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getLastActivityAuthor((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        if (_methodName548.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes548, parameterTypes)) {
            DiscussionCategoryLocalServiceUtil.delete((com.ext.portlet.model.DiscussionCategory) arguments[0]);

            return null;
        }

        if (_methodName549.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes549, parameterTypes)) {
            DiscussionCategoryLocalServiceUtil.update((com.ext.portlet.model.DiscussionCategory) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);

            return null;
        }

        if (_methodName550.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes550, parameterTypes)) {
            return DiscussionCategoryLocalServiceUtil.getCategoryGroup((com.ext.portlet.model.DiscussionCategory) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
