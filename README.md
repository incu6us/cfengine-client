# cfengine-client(beta)

CFEngine(http://cfengine.com/) java client for work with api

*Example:
```
CFConnection connection = new CFConnection(true);
connection.connect("127.0.0.1", "admin", "p@ssw0rd");
return connection.getApiResponse().getData().get(0).getCoreVersion();
```
