# Example repo to demonstrate Code Coverage Gates with CodeScene

This repository contains some simple Java code with unit tests. The purpose of the repo is to illustrate how CodeScene's code coverage gates work, as well 
as giving concrete examples on what the gating looks like for various scenarios. (e.g. lack of coverage in new code, updating non-executable lines of code, etc.).

As such, this repository is part of the CodeScene product documentation.

## Details for maintainers

### Generate build coverage - JaCoCo

mvn clean install

You find the xml file in target/site/jacoco/jacoco.xml

### github workflow

There is a playground workflow .github/workflows/test-run.yml
which can be executed manualy or on every PR open/update.
