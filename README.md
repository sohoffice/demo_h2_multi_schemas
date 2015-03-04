This is a demo project that shows how h2 can support multiple schemas.

The tricks are
- Use an init.sql to create the schemas before you actually use them
  The init.sql should be added to the jdbc url so it will be applied automatically
- Use evolution tools to provision the schema or apply SQL everytime the test cases are executed.