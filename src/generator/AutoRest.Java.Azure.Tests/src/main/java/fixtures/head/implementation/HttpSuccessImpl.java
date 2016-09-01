/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head.implementation;

import retrofit2.Retrofit;
import fixtures.head.HttpSuccess;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public final class HttpSuccessImpl implements HttpSuccess {
    /** The Retrofit service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHeadTestServiceImpl client;

    /**
     * Initializes an instance of HttpSuccessImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessImpl(Retrofit retrofit, AutoRestHeadTestServiceImpl client) {
        this.service = retrofit.create(HttpSuccessService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/200")
        Observable<Response<Void>> head200(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/204")
        Observable<Response<Void>> head204(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/404")
        Observable<Response<Void>> head404(@Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head200() throws CloudException, IOException {
        return head200Async().toBlocking().single();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Boolean> head200Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceCall.create(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @return the observable to the boolean object
     */
    public Observable<ServiceResponse<Boolean>> head200Async() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head200Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head200Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head204() throws CloudException, IOException {
        return head204Async().toBlocking().single();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Boolean> head204Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceCall.create(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @return the observable to the boolean object
     */
    public Observable<ServiceResponse<Boolean>> head204Async() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head204Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head204Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Boolean> head404() throws CloudException, IOException {
        return head404Async().toBlocking().single();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Boolean> head404Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceCall.create(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @return the observable to the boolean object
     */
    public Observable<ServiceResponse<Boolean>> head404Async() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<Void>, Observable<ServiceResponse<Boolean>>>() {
                @Override
                public Observable<ServiceResponse<Boolean>> call(Response<Void> response) {
                    try {
                        ServiceResponse<Boolean> clientResponse = head404Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Boolean> head404Delegate(Response<Void> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Boolean, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .buildEmpty(response);
    }

}