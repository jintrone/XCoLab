package com.ext.portlet.service.base;

import com.ext.portlet.service.ProposalAttributeServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProposalAttributeServiceClpInvoker {
    private String _methodName492;
    private String[] _methodParameterTypes492;
    private String _methodName493;
    private String[] _methodParameterTypes493;

    public ProposalAttributeServiceClpInvoker() {
        _methodName492 = "getBeanIdentifier";

        _methodParameterTypes492 = new String[] {  };

        _methodName493 = "setBeanIdentifier";

        _methodParameterTypes493 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName492.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
            return ProposalAttributeServiceUtil.getBeanIdentifier();
        }

        if (_methodName493.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
            ProposalAttributeServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
