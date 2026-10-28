# Wave project G

Independent Maven library `com.edwardnoaland.wave:wave-project-g:1.0.0`.

Direct dependencies: D, F. No business logic or tests; only an empty marker class.
Use the workspace-level README for setup, build order and expected waves.
Maven commands run from this repository use `../.tooling/maven-repository`.

## Refactoring and coverage fixture

`mvn -B clean verify` runs two JUnit tests and produces fresh JUnit XML,
`target/jacoco.exec`, and `target/site/jacoco/jacoco.xml`/HTML.
`describe` calls `calculate`, which calls private `scale`; the negative branch is
intentionally untested so analysis can show partial coverage without claiming
complete confidence. Renaming `doubledValue` in `scale` preserves public behavior
and provides a small observable diff for Scryer analyze.
