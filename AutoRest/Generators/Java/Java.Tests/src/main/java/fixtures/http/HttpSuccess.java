/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpSuccessService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/200")
        Call<Void> head200();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/success/200")
        Call<ResponseBody> get200();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/success/200")
        Call<ResponseBody> put200(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/success/200")
        Call<ResponseBody> patch200(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/success/200")
        Call<ResponseBody> post200(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/success/200", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete200(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/success/201")
        Call<ResponseBody> put201(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/success/201")
        Call<ResponseBody> post201(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/success/202")
        Call<ResponseBody> put202(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/success/202")
        Call<ResponseBody> patch202(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/success/202")
        Call<ResponseBody> post202(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/success/202", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/204")
        Call<Void> head204();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/success/204")
        Call<ResponseBody> put204(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/success/204")
        Call<ResponseBody> patch204(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/success/204")
        Call<ResponseBody> post204(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/success/204", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete204(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/success/404")
        Call<Void> head404();

    }
    /**
     * Return 200 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head200() throws ErrorException, IOException;

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head200Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Get 200 success.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> get200() throws ErrorException, IOException;

    /**
     * Get 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get200Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete200(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete200Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put201(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post201(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post201Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete202(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete202Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 204 status code if successful.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head204() throws ErrorException, IOException;

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head204Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete204(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete204Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 404 status code.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head404() throws ErrorException, IOException;

    /**
     * Return 404 status code.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head404Async(final ServiceCallback<Void> serviceCallback);

}
