# Android-Wrapper-Architecture for API

This sample will demonstrate how we can connect with multiple back end using same application even if data structure is different.

In this sample, we have created wrapper module. All APIs call be initiated from wrapper class only. Application will directly to connected only with Wrapper and not with any back end.
Wrapper class will communicate with Back-end and send response to application for update UI.

To add new back end, we just need to implement APIs library and bind with wrapper class. Here, Application is total independent from any back end.