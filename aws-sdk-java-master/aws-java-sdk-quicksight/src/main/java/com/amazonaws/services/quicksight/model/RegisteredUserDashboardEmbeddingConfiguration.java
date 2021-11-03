/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the dashboard you want to embed.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserDashboardEmbeddingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserDashboardEmbeddingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to
     * view it.
     * </p>
     * <p>
     * If the user does not have permission to view this dashboard, they see a permissions error message.
     * </p>
     */
    private String initialDashboardId;

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to
     * view it.
     * </p>
     * <p>
     * If the user does not have permission to view this dashboard, they see a permissions error message.
     * </p>
     * 
     * @param initialDashboardId
     *        The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *        URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has
     *        permissions to view it.</p>
     *        <p>
     *        If the user does not have permission to view this dashboard, they see a permissions error message.
     */

    public void setInitialDashboardId(String initialDashboardId) {
        this.initialDashboardId = initialDashboardId;
    }

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to
     * view it.
     * </p>
     * <p>
     * If the user does not have permission to view this dashboard, they see a permissions error message.
     * </p>
     * 
     * @return The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *         URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has
     *         permissions to view it.</p>
     *         <p>
     *         If the user does not have permission to view this dashboard, they see a permissions error message.
     */

    public String getInitialDashboardId() {
        return this.initialDashboardId;
    }

    /**
     * <p>
     * The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output URL.
     * When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has permissions to
     * view it.
     * </p>
     * <p>
     * If the user does not have permission to view this dashboard, they see a permissions error message.
     * </p>
     * 
     * @param initialDashboardId
     *        The dashboard ID for the dashboard that you want the user to see first. This ID is included in the output
     *        URL. When the URL in response is accessed, Amazon QuickSight renders this dashboard if the user has
     *        permissions to view it.</p>
     *        <p>
     *        If the user does not have permission to view this dashboard, they see a permissions error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserDashboardEmbeddingConfiguration withInitialDashboardId(String initialDashboardId) {
        setInitialDashboardId(initialDashboardId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInitialDashboardId() != null)
            sb.append("InitialDashboardId: ").append(getInitialDashboardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserDashboardEmbeddingConfiguration == false)
            return false;
        RegisteredUserDashboardEmbeddingConfiguration other = (RegisteredUserDashboardEmbeddingConfiguration) obj;
        if (other.getInitialDashboardId() == null ^ this.getInitialDashboardId() == null)
            return false;
        if (other.getInitialDashboardId() != null && other.getInitialDashboardId().equals(this.getInitialDashboardId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialDashboardId() == null) ? 0 : getInitialDashboardId().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserDashboardEmbeddingConfiguration clone() {
        try {
            return (RegisteredUserDashboardEmbeddingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserDashboardEmbeddingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}