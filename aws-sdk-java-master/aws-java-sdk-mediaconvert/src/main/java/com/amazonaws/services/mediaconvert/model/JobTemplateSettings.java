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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created
 * from it.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/JobTemplateSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplateSettings implements Serializable, Cloneable, StructuredPojo {

    /** When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. */
    private Integer adAvailOffset;
    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     */
    private AvailBlanking availBlanking;
    /** Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings. */
    private EsamSettings esam;
    /**
     * If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does
     * with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from
     * the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
     */
    private ExtendedDataServices extendedDataServices;
    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     */
    private java.util.List<InputTemplate> inputs;
    /**
     * Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate
     * and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition
     * to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     */
    private KantarWatermarkSettings kantarWatermark;
    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     */
    private MotionImageInserter motionImageInserter;
    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     * settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging
     * for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of
     * nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     */
    private NielsenConfiguration nielsenConfiguration;
    /**
     * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert
     * uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you
     * also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert
     * implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM
     * Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
     */
    private NielsenNonLinearWatermarkSettings nielsenNonLinearWatermark;
    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */
    private java.util.List<OutputGroup> outputGroups;
    /**
     * These settings control how the service handles timecodes throughout the job. These settings don't affect input
     * clipping.
     */
    private TimecodeConfig timecodeConfig;
    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed
     * metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     */
    private TimedMetadataInsertion timedMetadataInsertion;

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     */

    public void setAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @return When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     */

    public Integer getAdAvailOffset() {
        return this.adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * 
     * @param adAvailOffset
     *        When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withAdAvailOffset(Integer adAvailOffset) {
        setAdAvailOffset(adAvailOffset);
        return this;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *        SCTE-35 triggered ad avails.
     */

    public void setAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @return Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *         SCTE-35 triggered ad avails.
     */

    public AvailBlanking getAvailBlanking() {
        return this.availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during SCTE-35
     * triggered ad avails.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking. Video can be blanked or overlaid with an image, and audio muted during
     *        SCTE-35 triggered ad avails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withAvailBlanking(AvailBlanking availBlanking) {
        setAvailBlanking(availBlanking);
        return this;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
     * 
     * @param esam
     *        Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these
     *        settings.
     */

    public void setEsam(EsamSettings esam) {
        this.esam = esam;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
     * 
     * @return Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these
     *         settings.
     */

    public EsamSettings getEsam() {
        return this.esam;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
     * 
     * @param esam
     *        Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withEsam(EsamSettings esam) {
        setEsam(esam);
        return this;
    }

    /**
     * If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does
     * with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from
     * the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
     * 
     * @param extendedDataServices
     *        If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert
     *        does with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove
     *        them from the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h
     *        Content Advisory.
     */

    public void setExtendedDataServices(ExtendedDataServices extendedDataServices) {
        this.extendedDataServices = extendedDataServices;
    }

    /**
     * If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does
     * with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from
     * the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
     * 
     * @return If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what
     *         MediaConvert does with the Extended Data Services (XDS) packets. You can choose to pass through XDS
     *         packets, or remove them from the output. For more information about XDS, see EIA-608 Line Data Services,
     *         section 9.5.1.5 05h Content Advisory.
     */

    public ExtendedDataServices getExtendedDataServices() {
        return this.extendedDataServices;
    }

    /**
     * If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does
     * with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from
     * the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
     * 
     * @param extendedDataServices
     *        If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert
     *        does with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove
     *        them from the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h
     *        Content Advisory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withExtendedDataServices(ExtendedDataServices extendedDataServices) {
        setExtendedDataServices(extendedDataServices);
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @return Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *         job template. Using the API, you can include multiple inputs when referencing a job template.
     */

    public java.util.List<InputTemplate> getInputs() {
        return inputs;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     */

    public void setInputs(java.util.Collection<InputTemplate> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<InputTemplate>(inputs);
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withInputs(InputTemplate... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<InputTemplate>(inputs.length));
        }
        for (InputTemplate ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job
     * template. Using the API, you can include multiple inputs when referencing a job template.
     * 
     * @param inputs
     *        Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a
     *        job template. Using the API, you can include multiple inputs when referencing a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withInputs(java.util.Collection<InputTemplate> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate
     * and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition
     * to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     * 
     * @param kantarWatermark
     *        Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to
     *        generate and place Kantar watermarks in your output audio. These settings apply to every output in your
     *        job. In addition to specifying these values, you also need to store your Kantar credentials in AWS Secrets
     *        Manager. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     */

    public void setKantarWatermark(KantarWatermarkSettings kantarWatermark) {
        this.kantarWatermark = kantarWatermark;
    }

    /**
     * Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate
     * and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition
     * to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     * 
     * @return Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to
     *         generate and place Kantar watermarks in your output audio. These settings apply to every output in your
     *         job. In addition to specifying these values, you also need to store your Kantar credentials in AWS
     *         Secrets Manager. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     */

    public KantarWatermarkSettings getKantarWatermark() {
        return this.kantarWatermark;
    }

    /**
     * Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate
     * and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition
     * to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more
     * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     * 
     * @param kantarWatermark
     *        Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to
     *        generate and place Kantar watermarks in your output audio. These settings apply to every output in your
     *        job. In addition to specifying these values, you also need to store your Kantar credentials in AWS Secrets
     *        Manager. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withKantarWatermark(KantarWatermarkSettings kantarWatermark) {
        setKantarWatermark(kantarWatermark);
        return this;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     * 
     * @param motionImageInserter
     *        Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *        outputs in all output groups. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     */

    public void setMotionImageInserter(MotionImageInserter motionImageInserter) {
        this.motionImageInserter = motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     * 
     * @return Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *         outputs in all output groups. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     */

    public MotionImageInserter getMotionImageInserter() {
        return this.motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in
     * all output groups. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     * 
     * @param motionImageInserter
     *        Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all
     *        outputs in all output groups. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withMotionImageInserter(MotionImageInserter motionImageInserter) {
        setMotionImageInserter(motionImageInserter);
        return this;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     * settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging
     * for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of
     * nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     * 
     * @param nielsenConfiguration
     *        Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     *        settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     *        tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance
     *        of nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     *        nielsenConfiguration, you still enable the setting.
     */

    public void setNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     * settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging
     * for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of
     * nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     * 
     * @return Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     *         settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     *         tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance
     *         of nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     *         nielsenConfiguration, you still enable the setting.
     */

    public NielsenConfiguration getNielsenConfiguration() {
        return this.nielsenConfiguration;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     * settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging
     * for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of
     * nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     * 
     * @param nielsenConfiguration
     *        Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these
     *        settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     *        tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance
     *        of nielsenConfiguration in your JSON job specification. Even if you don't include any children of
     *        nielsenConfiguration, you still enable the setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        setNielsenConfiguration(nielsenConfiguration);
        return this;
    }

    /**
     * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert
     * uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you
     * also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert
     * implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM
     * Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
     * 
     * @param nielsenNonLinearWatermark
     *        Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that
     *        MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to specifying
     *        these values, you also need to set up your cloud TIC server. These settings apply to every output in your
     *        job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark
     *        SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC]
     *        Version [5.0.0]
     */

    public void setNielsenNonLinearWatermark(NielsenNonLinearWatermarkSettings nielsenNonLinearWatermark) {
        this.nielsenNonLinearWatermark = nielsenNonLinearWatermark;
    }

    /**
     * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert
     * uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you
     * also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert
     * implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM
     * Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
     * 
     * @return Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that
     *         MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to
     *         specifying these values, you also need to set up your cloud TIC server. These settings apply to every
     *         output in your job. The MediaConvert implementation is currently with the following Nielsen versions:
     *         Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark
     *         Authenticator [SID_TIC] Version [5.0.0]
     */

    public NielsenNonLinearWatermarkSettings getNielsenNonLinearWatermark() {
        return this.nielsenNonLinearWatermark;
    }

    /**
     * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert
     * uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you
     * also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert
     * implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM
     * Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
     * 
     * @param nielsenNonLinearWatermark
     *        Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that
     *        MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to specifying
     *        these values, you also need to set up your cloud TIC server. These settings apply to every output in your
     *        job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark
     *        SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC]
     *        Version [5.0.0]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withNielsenNonLinearWatermark(NielsenNonLinearWatermarkSettings nielsenNonLinearWatermark) {
        setNielsenNonLinearWatermark(nielsenNonLinearWatermark);
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @return (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *         All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *         group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *         required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *         settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *         HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *         MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */

    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */

    public void setOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        if (outputGroups == null) {
            this.outputGroups = null;
            return;
        }

        this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups);
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputGroups(java.util.Collection)} or {@link #withOutputGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withOutputGroups(OutputGroup... outputGroups) {
        if (this.outputGroups == null) {
            setOutputGroups(new java.util.ArrayList<OutputGroup>(outputGroups.length));
        }
        for (OutputGroup ele : outputGroups) {
            this.outputGroups.add(ele);
        }
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All
     * unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as
     * well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object
     * depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     * are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings *
     * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * 
     * @param outputGroups
     *        (OutputGroups) contains one group of settings for each set of outputs that share a common package type.
     *        All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output
     *        group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This
     *        required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type,
     *        settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *        HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *        MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        setOutputGroups(outputGroups);
        return this;
    }

    /**
     * These settings control how the service handles timecodes throughout the job. These settings don't affect input
     * clipping.
     * 
     * @param timecodeConfig
     *        These settings control how the service handles timecodes throughout the job. These settings don't affect
     *        input clipping.
     */

    public void setTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
    }

    /**
     * These settings control how the service handles timecodes throughout the job. These settings don't affect input
     * clipping.
     * 
     * @return These settings control how the service handles timecodes throughout the job. These settings don't affect
     *         input clipping.
     */

    public TimecodeConfig getTimecodeConfig() {
        return this.timecodeConfig;
    }

    /**
     * These settings control how the service handles timecodes throughout the job. These settings don't affect input
     * clipping.
     * 
     * @param timecodeConfig
     *        These settings control how the service handles timecodes throughout the job. These settings don't affect
     *        input clipping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withTimecodeConfig(TimecodeConfig timecodeConfig) {
        setTimecodeConfig(timecodeConfig);
        return this;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed
     * metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     * 
     * @param timedMetadataInsertion
     *        Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To
     *        include timed metadata, you must enable it here, enable it in each output container, and specify tags and
     *        timecodes in ID3 insertion (Id3Insertion) objects.
     */

    public void setTimedMetadataInsertion(TimedMetadataInsertion timedMetadataInsertion) {
        this.timedMetadataInsertion = timedMetadataInsertion;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed
     * metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     * 
     * @return Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To
     *         include timed metadata, you must enable it here, enable it in each output container, and specify tags and
     *         timecodes in ID3 insertion (Id3Insertion) objects.
     */

    public TimedMetadataInsertion getTimedMetadataInsertion() {
        return this.timedMetadataInsertion;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To include timed
     * metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     * 
     * @param timedMetadataInsertion
     *        Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in any HLS outputs. To
     *        include timed metadata, you must enable it here, enable it in each output container, and specify tags and
     *        timecodes in ID3 insertion (Id3Insertion) objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSettings withTimedMetadataInsertion(TimedMetadataInsertion timedMetadataInsertion) {
        setTimedMetadataInsertion(timedMetadataInsertion);
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
        if (getAdAvailOffset() != null)
            sb.append("AdAvailOffset: ").append(getAdAvailOffset()).append(",");
        if (getAvailBlanking() != null)
            sb.append("AvailBlanking: ").append(getAvailBlanking()).append(",");
        if (getEsam() != null)
            sb.append("Esam: ").append(getEsam()).append(",");
        if (getExtendedDataServices() != null)
            sb.append("ExtendedDataServices: ").append(getExtendedDataServices()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getKantarWatermark() != null)
            sb.append("KantarWatermark: ").append(getKantarWatermark()).append(",");
        if (getMotionImageInserter() != null)
            sb.append("MotionImageInserter: ").append(getMotionImageInserter()).append(",");
        if (getNielsenConfiguration() != null)
            sb.append("NielsenConfiguration: ").append(getNielsenConfiguration()).append(",");
        if (getNielsenNonLinearWatermark() != null)
            sb.append("NielsenNonLinearWatermark: ").append(getNielsenNonLinearWatermark()).append(",");
        if (getOutputGroups() != null)
            sb.append("OutputGroups: ").append(getOutputGroups()).append(",");
        if (getTimecodeConfig() != null)
            sb.append("TimecodeConfig: ").append(getTimecodeConfig()).append(",");
        if (getTimedMetadataInsertion() != null)
            sb.append("TimedMetadataInsertion: ").append(getTimedMetadataInsertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateSettings == false)
            return false;
        JobTemplateSettings other = (JobTemplateSettings) obj;
        if (other.getAdAvailOffset() == null ^ this.getAdAvailOffset() == null)
            return false;
        if (other.getAdAvailOffset() != null && other.getAdAvailOffset().equals(this.getAdAvailOffset()) == false)
            return false;
        if (other.getAvailBlanking() == null ^ this.getAvailBlanking() == null)
            return false;
        if (other.getAvailBlanking() != null && other.getAvailBlanking().equals(this.getAvailBlanking()) == false)
            return false;
        if (other.getEsam() == null ^ this.getEsam() == null)
            return false;
        if (other.getEsam() != null && other.getEsam().equals(this.getEsam()) == false)
            return false;
        if (other.getExtendedDataServices() == null ^ this.getExtendedDataServices() == null)
            return false;
        if (other.getExtendedDataServices() != null && other.getExtendedDataServices().equals(this.getExtendedDataServices()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getKantarWatermark() == null ^ this.getKantarWatermark() == null)
            return false;
        if (other.getKantarWatermark() != null && other.getKantarWatermark().equals(this.getKantarWatermark()) == false)
            return false;
        if (other.getMotionImageInserter() == null ^ this.getMotionImageInserter() == null)
            return false;
        if (other.getMotionImageInserter() != null && other.getMotionImageInserter().equals(this.getMotionImageInserter()) == false)
            return false;
        if (other.getNielsenConfiguration() == null ^ this.getNielsenConfiguration() == null)
            return false;
        if (other.getNielsenConfiguration() != null && other.getNielsenConfiguration().equals(this.getNielsenConfiguration()) == false)
            return false;
        if (other.getNielsenNonLinearWatermark() == null ^ this.getNielsenNonLinearWatermark() == null)
            return false;
        if (other.getNielsenNonLinearWatermark() != null && other.getNielsenNonLinearWatermark().equals(this.getNielsenNonLinearWatermark()) == false)
            return false;
        if (other.getOutputGroups() == null ^ this.getOutputGroups() == null)
            return false;
        if (other.getOutputGroups() != null && other.getOutputGroups().equals(this.getOutputGroups()) == false)
            return false;
        if (other.getTimecodeConfig() == null ^ this.getTimecodeConfig() == null)
            return false;
        if (other.getTimecodeConfig() != null && other.getTimecodeConfig().equals(this.getTimecodeConfig()) == false)
            return false;
        if (other.getTimedMetadataInsertion() == null ^ this.getTimedMetadataInsertion() == null)
            return false;
        if (other.getTimedMetadataInsertion() != null && other.getTimedMetadataInsertion().equals(this.getTimedMetadataInsertion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdAvailOffset() == null) ? 0 : getAdAvailOffset().hashCode());
        hashCode = prime * hashCode + ((getAvailBlanking() == null) ? 0 : getAvailBlanking().hashCode());
        hashCode = prime * hashCode + ((getEsam() == null) ? 0 : getEsam().hashCode());
        hashCode = prime * hashCode + ((getExtendedDataServices() == null) ? 0 : getExtendedDataServices().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getKantarWatermark() == null) ? 0 : getKantarWatermark().hashCode());
        hashCode = prime * hashCode + ((getMotionImageInserter() == null) ? 0 : getMotionImageInserter().hashCode());
        hashCode = prime * hashCode + ((getNielsenConfiguration() == null) ? 0 : getNielsenConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNielsenNonLinearWatermark() == null) ? 0 : getNielsenNonLinearWatermark().hashCode());
        hashCode = prime * hashCode + ((getOutputGroups() == null) ? 0 : getOutputGroups().hashCode());
        hashCode = prime * hashCode + ((getTimecodeConfig() == null) ? 0 : getTimecodeConfig().hashCode());
        hashCode = prime * hashCode + ((getTimedMetadataInsertion() == null) ? 0 : getTimedMetadataInsertion().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplateSettings clone() {
        try {
            return (JobTemplateSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobTemplateSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}