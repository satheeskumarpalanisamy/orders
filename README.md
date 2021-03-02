# orders

## Step 1: Creating the certificate
Java provides the keytool utility to create and manage certificates locally. Keytool is available along with other JDK utilities in JDK_HOME/bin directory. Let us execute the following keytool command to generate a new certificate:
keytool -genkey -keyalg RSA -alias medium -keystore medium.jks -storepass password -validity 365 -keysize 4096 -storetype pkcs12
We are generating a certificate along with the following tasks in the above command:
Using the RSA algorithm
Providing an alias name as medium
Naming the Keystore file as medium.jks
Validity for one year
Once you hit this command, it will prompt for a few details and the certificate will be created. Copy this certificate in the src/main/resources directory so that it will be available at classpath.
## Step 2: Configuring the application with TLS
Now that we are done with the certificate generation, let us add the following information in the Spring boot application.properties to enable TLS:
server.ssl.key-store=classpath:medium.jks
server.ssl.key-store-type=pkcs12
server.ssl.key-store-password=password
server.ssl.key-password=password
server.ssl.key-alias=medium
server.port=8443
## Step 3: Testing the API
We have added the TLS configuration in Spring boot and the application is ready to run in HTTPS. Open Postman/Browser and hit the below URL:
https://localhost:8100/