package com.ext.portlet.service.base;

import com.ext.portlet.service.Plan2ProposalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Plan2ProposalServiceClpInvoker {
    private String _methodName492;
    private String[] _methodParameterTypes492;
    private String _methodName493;
    private String[] _methodParameterTypes493;

    public Plan2ProposalServiceClpInvoker() {
        _methodName492 = "getBeanIdentifier";

        _methodParameterTypes492 = new String[] {  };

        _methodName493 = "setBeanIdentifier";

        _methodParameterTypes493 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName492.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
            return Plan2ProposalServiceUtil.getBeanIdentifier();
        }

        if (_methodName493.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
            Plan2ProposalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
