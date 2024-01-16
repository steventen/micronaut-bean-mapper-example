## Micronaut bean mapper

Reproduce the bug reported here: https://github.com/micronaut-projects/micronaut-core/issues/10356

1. Start db: `docker-compose up`
2. Run server: `./gradlew run`
3. Visit http://localhost:8080/companies/a
