/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123.implementation;

import retrofit2.Retrofit;
import fixtures.bodydatetimerfc1123.Datetimerfc1123s;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123s.
 */
public final class Datetimerfc1123sImpl implements Datetimerfc1123s {
    /** The Retrofit service to perform REST calls. */
    private Datetimerfc1123sService service;
    /** The service client containing this operation class. */
    private AutoRestRFC1123DateTimeTestServiceImpl client;

    /**
     * Initializes an instance of Datetimerfc1123s.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public Datetimerfc1123sImpl(Retrofit retrofit, AutoRestRFC1123DateTimeTestServiceImpl client) {
        this.service = retrofit.create(Datetimerfc1123sService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datetimerfc1123s to be
     * used by Retrofit to perform actually REST calls.
     */
    interface Datetimerfc1123sService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/null")
        Observable<Response<ResponseBody>> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/invalid")
        Observable<Response<ResponseBody>> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/overflow")
        Observable<Response<ResponseBody>> getOverflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/underflow")
        Observable<Response<ResponseBody>> getUnderflow();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/max")
        Observable<Response<ResponseBody>> putUtcMaxDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/lowercase")
        Observable<Response<ResponseBody>> getUtcLowercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/max/uppercase")
        Observable<Response<ResponseBody>> getUtcUppercaseMaxDateTime();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("datetimerfc1123/min")
        Observable<Response<ResponseBody>> putUtcMinDateTime(@Body DateTimeRfc1123 datetimeBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("datetimerfc1123/min")
        Observable<Response<ResponseBody>> getUtcMinDateTime();

    }

    /**
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getNull() throws ErrorException, IOException {
        return getNullAsync().toBlocking().single();
    }

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getNullAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getNullAsync(), serviceCallback);
    }

    /**
     * Get null datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getNullAsync() {
        return service.getNull()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getNullDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getInvalid() throws ErrorException, IOException {
        return getInvalidAsync().toBlocking().single();
    }

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getInvalidAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getInvalidAsync() {
        return service.getInvalid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getInvalidDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getOverflow() throws ErrorException, IOException {
        return getOverflowAsync().toBlocking().single();
    }

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getOverflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getOverflowAsync(), serviceCallback);
    }

    /**
     * Get overflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getOverflowAsync() {
        return service.getOverflow()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getOverflowDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getOverflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUnderflow() throws ErrorException, IOException {
        return getUnderflowAsync().toBlocking().single();
    }

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getUnderflowAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getUnderflowAsync(), serviceCallback);
    }

    /**
     * Get underflow datetime value.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUnderflowAsync() {
        return service.getUnderflow()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUnderflowDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUnderflowDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMaxDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        return putUtcMaxDateTimeAsync(datetimeBody).toBlocking().single();
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putUtcMaxDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putUtcMaxDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUtcMaxDateTimeAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMaxDateTime(datetimeBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUtcMaxDateTimeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putUtcMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcLowercaseMaxDateTime() throws ErrorException, IOException {
        return getUtcLowercaseMaxDateTimeAsync().toBlocking().single();
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getUtcLowercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcLowercaseMaxDateTimeAsync() {
        return service.getUtcLowercaseMaxDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcLowercaseMaxDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcUppercaseMaxDateTime() throws ErrorException, IOException {
        return getUtcUppercaseMaxDateTimeAsync().toBlocking().single();
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getUtcUppercaseMaxDateTimeAsync(), serviceCallback);
    }

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcUppercaseMaxDateTimeAsync() {
        return service.getUtcUppercaseMaxDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcUppercaseMaxDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putUtcMinDateTime(DateTime datetimeBody) throws ErrorException, IOException, IllegalArgumentException {
        return putUtcMinDateTimeAsync(datetimeBody).toBlocking().single();
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> putUtcMinDateTimeAsync(DateTime datetimeBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(putUtcMinDateTimeAsync(datetimeBody), serviceCallback);
    }

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> putUtcMinDateTimeAsync(DateTime datetimeBody) {
        if (datetimeBody == null) {
            throw new IllegalArgumentException("Parameter datetimeBody is required and cannot be null.");
        }
        DateTimeRfc1123 datetimeBodyConverted = new DateTimeRfc1123(datetimeBody);
        return service.putUtcMinDateTime(datetimeBodyConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = putUtcMinDateTimeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> putUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTime object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DateTime> getUtcMinDateTime() throws ErrorException, IOException {
        return getUtcMinDateTimeAsync().toBlocking().single();
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DateTime> getUtcMinDateTimeAsync(final ServiceCallback<DateTime> serviceCallback) {
        return ServiceCall.create(getUtcMinDateTimeAsync(), serviceCallback);
    }

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return the observable to the DateTime object
     */
    public Observable<ServiceResponse<DateTime>> getUtcMinDateTimeAsync() {
        return service.getUtcMinDateTime()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DateTime>>>() {
                @Override
                public Observable<ServiceResponse<DateTime>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DateTimeRfc1123> result = getUtcMinDateTimeDelegate(response);
                        DateTime body = null;
                        if (result.getBody() != null) {
                            body = result.getBody().getDateTime();
                        }
                        ServiceResponse<DateTime> clientResponse = new ServiceResponse<DateTime>(body, result.getResponse());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DateTimeRfc1123> getUtcMinDateTimeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<DateTimeRfc1123, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DateTimeRfc1123>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}