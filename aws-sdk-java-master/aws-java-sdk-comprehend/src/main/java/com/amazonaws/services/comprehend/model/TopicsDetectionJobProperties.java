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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a topic detection job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TopicsDetectionJobProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicsDetectionJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier assigned to the topic detection job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The name of the topic detection job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the failure
     * is shown in the <code>Message</code> field.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * A description for the status of a job.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The time that the topic detection job was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that the topic detection job was completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The input data configuration supplied when you created the topic detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The output data configuration supplied when you created the topic detection job.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The number of topics to detect supplied when you created the topic detection job. The default is 10.
     * </p>
     */
    private Integer numberOfTopics;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your job data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String volumeKmsKeyId;
    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for
     * your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * The identifier assigned to the topic detection job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the topic detection job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the topic detection job.
     * </p>
     * 
     * @return The identifier assigned to the topic detection job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier assigned to the topic detection job.
     * </p>
     * 
     * @param jobId
     *        The identifier assigned to the topic detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for
     *        the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:</p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     *        </p>
     *        <p>
     *        The following is an example job ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier
     *         for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as
     *         follows:</p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     *         </p>
     *         <p>
     *         The following is an example job ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for
     *        the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:</p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;</code>
     *        </p>
     *        <p>
     *        The following is an example job ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:comprehend:us-west-2:111122223333:topics-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The name of the topic detection job.
     * </p>
     * 
     * @param jobName
     *        The name of the topic detection job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the topic detection job.
     * </p>
     * 
     * @return The name of the topic detection job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the topic detection job.
     * </p>
     * 
     * @param jobName
     *        The name of the topic detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the failure
     * is shown in the <code>Message</code> field.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the
     *        failure is shown in the <code>Message</code> field.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the failure
     * is shown in the <code>Message</code> field.
     * </p>
     * 
     * @return The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the
     *         failure is shown in the <code>Message</code> field.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the failure
     * is shown in the <code>Message</code> field.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the
     *        failure is shown in the <code>Message</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TopicsDetectionJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the failure
     * is shown in the <code>Message</code> field.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the topic detection job. If the status is <code>Failed</code>, the reason for the
     *        failure is shown in the <code>Message</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public TopicsDetectionJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description for the status of a job.
     * </p>
     * 
     * @param message
     *        A description for the status of a job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description for the status of a job.
     * </p>
     * 
     * @return A description for the status of a job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description for the status of a job.
     * </p>
     * 
     * @param message
     *        A description for the status of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The time that the topic detection job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the topic detection job was submitted for processing.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the topic detection job was submitted for processing.
     * </p>
     * 
     * @return The time that the topic detection job was submitted for processing.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the topic detection job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the topic detection job was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that the topic detection job was completed.
     * </p>
     * 
     * @param endTime
     *        The time that the topic detection job was completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the topic detection job was completed.
     * </p>
     * 
     * @return The time that the topic detection job was completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the topic detection job was completed.
     * </p>
     * 
     * @param endTime
     *        The time that the topic detection job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The input data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration supplied when you created the topic detection job.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @return The input data configuration supplied when you created the topic detection job.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration supplied when you created the topic detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The output data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration supplied when you created the topic detection job.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @return The output data configuration supplied when you created the topic detection job.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration supplied when you created the topic detection job.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration supplied when you created the topic detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The number of topics to detect supplied when you created the topic detection job. The default is 10.
     * </p>
     * 
     * @param numberOfTopics
     *        The number of topics to detect supplied when you created the topic detection job. The default is 10.
     */

    public void setNumberOfTopics(Integer numberOfTopics) {
        this.numberOfTopics = numberOfTopics;
    }

    /**
     * <p>
     * The number of topics to detect supplied when you created the topic detection job. The default is 10.
     * </p>
     * 
     * @return The number of topics to detect supplied when you created the topic detection job. The default is 10.
     */

    public Integer getNumberOfTopics() {
        return this.numberOfTopics;
    }

    /**
     * <p>
     * The number of topics to detect supplied when you created the topic detection job. The default is 10.
     * </p>
     * 
     * @param numberOfTopics
     *        The number of topics to detect supplied when you created the topic detection job. The default is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withNumberOfTopics(Integer numberOfTopics) {
        setNumberOfTopics(numberOfTopics);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your job data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your job data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your job data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon
     *         Comprehend read access to your job data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read
     * access to your job data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend
     *        read access to your job data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the
     *         storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId
     *         can be either of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume
     * attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the
     * following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeKmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage
     *        volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be
     *        either of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for
     * your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using
     *        for your topic detection job. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for
     * your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @return Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using
     *         for your topic detection job. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for
     * your topic detection job. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * </p>
     * 
     * @param vpcConfig
     *        Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using
     *        for your topic detection job. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicsDetectionJobProperties withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getNumberOfTopics() != null)
            sb.append("NumberOfTopics: ").append(getNumberOfTopics()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicsDetectionJobProperties == false)
            return false;
        TopicsDetectionJobProperties other = (TopicsDetectionJobProperties) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getNumberOfTopics() == null ^ this.getNumberOfTopics() == null)
            return false;
        if (other.getNumberOfTopics() != null && other.getNumberOfTopics().equals(this.getNumberOfTopics()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTopics() == null) ? 0 : getNumberOfTopics().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public TopicsDetectionJobProperties clone() {
        try {
            return (TopicsDetectionJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.TopicsDetectionJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}