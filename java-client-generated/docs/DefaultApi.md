# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/SANKETDEOALE_1/UserDetails/2.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingGet**](DefaultApi.md#pingGet) | **GET** /ping | Server heartbeat operation
[**usersGet**](DefaultApi.md#usersGet) | **GET** /users | Server example operation
[**usersIdGet**](DefaultApi.md#usersIdGet) | **GET** /users/{id} | 
[**usersPost**](DefaultApi.md#usersPost) | **POST** /users | 

<a name="pingGet"></a>
# **pingGet**
> pingGet()

Server heartbeat operation

This operation shows how to override the global security defined above, as we want to open it up for all users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.pingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersGet"></a>
# **usersGet**
> Users usersGet(bodyLimit, pageLimit)

Server example operation

Obtain information about users from the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer bodyLimit = 56; // Integer | The amount of users returned
Integer pageLimit = 56; // Integer | The pages to return users info
try {
    Users result = apiInstance.usersGet(bodyLimit, pageLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bodyLimit** | **Integer**| The amount of users returned | [optional] [enum: 10, 20]
 **pageLimit** | **Integer**| The pages to return users info | [optional] [enum: 1, 5]

### Return type

[**Users**](Users.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersIdGet"></a>
# **usersIdGet**
> User usersIdGet(id)



Obtain information about specific user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    User result = apiInstance.usersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersPost"></a>
# **usersPost**
> usersPost(body)



Creates a new user in the database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User body = new User(); // User | 
try {
    apiInstance.usersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: Not defined

