/* Copyright 2004 The JA-SIG Collaborative.  All rights reserved.
*  See license distributed with this file and
*  available online at http://www.uportal.org/license.html
*/

package org.jasig.portal.container.om.servlet;

import java.io.Serializable;

import org.apache.pluto.om.common.DescriptionSet;

/**
 * Data structure to support WebApplicationDefinition for
 * marshalling and unmarshalling of web.xml.
 * Not needed by the Pluto container.
 * @author Ken Weiner, kweiner@unicon.net
 * @version $Revision$
 */
public class EjbLocalRefImpl implements Serializable {

    private DescriptionSet descriptions;
    private String ejbRefName;
    private String ejbRefType;
    private String localHome;
    private String local;
    private String ejbLink;
    
    public DescriptionSet getDescriptions() {
        return descriptions;
    }

    public String getEjbRefName() {
        return ejbRefName;
    }

    public String getEjbRefType() {
        return ejbRefType;
    }

    public String getLocalHome() {
        return localHome;
    }

    public String getLocal() {
        return local;
    }

    public String getEjbLink() {
        return ejbLink;
    }

    public void setDescriptions(DescriptionSet descriptions) {
         this.descriptions = descriptions;
    }

    public void setEjbRefName(String ejbRefName) {
        this.ejbRefName = ejbRefName;
    }

    public void setEjbRefType(String ejbRefType) {
        this.ejbRefType = ejbRefType;
    }

    public void setLocalHome(String localHome) {
        this.localHome = localHome;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public void setEjbLink(String ejbLink) {
        this.ejbLink = ejbLink;
    }
    
}
