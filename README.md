# jena-rdfs-validation-example

Simple Java class showing how to use Jena to do basic RDFS validation.

## Running

```
mvn:exec
```

You should see:

```
❯ mvn exec:java
[INFO] Scanning for projects...
[INFO]
[INFO] -----------------------< edu.ucsb.nceas:jenaval >-----------------------
[INFO] Building jenaval 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ jenaval ---
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Conflicts
 - Error (dtRange): Property http://www.hpl.hp.com/semweb/2003/eg#bar has a typed range Datatype[http://www.w3.org/2001/XMLSchema#integer -> class java.math.BigInteger]that is not compatible with "25.5"^^http://www.w3.org/2001/XMLSchema#decimal
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.050 s
[INFO] Finished at: 2020-05-15T11:37:00-08:00
[INFO] ------------------------------------------------------------------------
```
