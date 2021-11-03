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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Workflow JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowJsonUnmarshaller implements Unmarshaller<Workflow, JsonUnmarshallerContext> {

    public Workflow unmarshall(JsonUnmarshallerContext context) throws Exception {
        Workflow workflow = new Workflow();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    workflow.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    workflow.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRunProperties", targetDepth)) {
                    context.nextToken();
                    workflow.setDefaultRunProperties(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    context.nextToken();
                    workflow.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    context.nextToken();
                    workflow.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastRun", targetDepth)) {
                    context.nextToken();
                    workflow.setLastRun(WorkflowRunJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Graph", targetDepth)) {
                    context.nextToken();
                    workflow.setGraph(WorkflowGraphJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxConcurrentRuns", targetDepth)) {
                    context.nextToken();
                    workflow.setMaxConcurrentRuns(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BlueprintDetails", targetDepth)) {
                    context.nextToken();
                    workflow.setBlueprintDetails(BlueprintDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflow;
    }

    private static WorkflowJsonUnmarshaller instance;

    public static WorkflowJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowJsonUnmarshaller();
        return instance;
    }
}