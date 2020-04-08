# demo-appconfiguration-kv

### Fill in configurations

```properties
# Fill in the app configuration connection string
spring.cloud.azure.appconfiguration.stores[0].connection-string=fill-your-appconfiguration-store-connection-string-here

# Specify if Key Vault should be used to retrieve secrets.
azure.keyvault.enabled=true

# Specify the URI of your Key Vault (e.g.: https://name.vault.azure.net/).
# Fill in the key vault uri
azure.keyvault.uri=fill-your-keyvault-uri-here
# Fill in the service principal client id
azure.keyvault.client-id=fill-your-client-id-here
# Fill in the service principal client secret
azure.keyvault.client-key=fill-your-client-secret-here
# Fill in your tenant id
azure.keyvault.tenant-id=fill-your-tenant-id-here
```

### Add entry in App Configuration

Put an entry with key=`/application/config.messages`, value=`whatever value` in App Configuration. Or you could change 
`MessageProperties.java` to use your own configurations.

### Add entry in Key Vault

Put an secret entry with key=`azure-cosmosdb-key`, value=`whatever value` in Key Vault. Or you could change the 
`@Value("${azure.cosmosdb.key:local}")` in `HelloController.java` to use your own secret.

### Try the application

Start the application and go to `http://localhost:8080` in your browser.   