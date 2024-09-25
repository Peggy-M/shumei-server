package com.peppa.springweb;

import io.minio.GetPresignedObjectUrlArgs;
import io.minio.MinioClient;
import io.minio.errors.*;
import io.minio.http.Method;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, InvalidExpiresRangeException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        // Get presigned URL string to download 'my-objectname' in 'my-bucketname'
// with an expiration of 2 hours.
//
// Additionally also add 'response-content-type' to dynamically set content-type
// for the server response.
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("response-content-type", "application/json");
        MinioClient minioClient =
                MinioClient.builder()
                        .endpoint("http://127.0.0.1:9000")
                        .credentials("minioadmin",
                                "minioadmin")
                        .build();
        String url = minioClient.getPresignedObjectUrl(
                        GetPresignedObjectUrlArgs.builder()
                                .method(Method.GET)
                                .bucket("applogs")
                                .object("/hello.go")
                                .expiry(2, TimeUnit.HOURS)
                                .extraQueryParams(reqParams)
                                .build());
        System.out.println(url);
//
//// Get presigned URL string to upload 'my-objectname' in 'my-bucketname'
//// with an expiration of 1 day.
//        String url =
//                minioClient.getPresignedObjectUrl(
//                        GetPresignedObjectUrlArgs.builder()
//                                .method(Method.PUT)
//                                .bucket("my-bucketname")
//                                .object("my-objectname")
//                                .expiry(1, TimeUnit.DAYS)
//                                .build());
//        System.out.println(url);
//
//// Get presigned URL string to lookup metadata for 'my-objectname' in 'my-bucketname'
//// with an expiration of 2 hours.
////
//// Additionally also add 'response-content-type' to dynamically set content-type
//// for the server metadata response.
//        Map<String, String> reqParams = new HashMap<String, String>();
//        reqParams.put("response-content-type", "application/json");
//
//        String url =
//                minioClient.getPresignedObjectUrl(
//                        GetPresignedObjectUrlArgs.builder()
//                                .method(Method.HEAD)
//                                .bucket("my-bucketname")
//                                .object("my-objectname")
//                                .expiry(2, TimeUnit.HOURS)
//                                .extraQueryParams(reqParams)
//                                .build());
//        System.out.println(url);
    }
}
