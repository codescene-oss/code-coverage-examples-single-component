# Example repo to demonstrate Code Coverage Gates with CodeScene

This repository contains one simple Java module with unit tests. The purpose of the repo is to illustrate how CodeScene's code coverage gates work, as well 
as give concrete examples of what the gating looks like for various scenarios. (e.g. lack of coverage in new code, updating non-executable lines of code, etc.).

As such, this repository is part of the [CodeScene product documentation](https://codescene.io/docs/guides/code-coverage-gates/check-code-coverage-in-pull-and-merge-requests.html).

That [documentation](https://codescene.io/docs/guides/code-coverage-gates/check-code-coverage-in-pull-and-merge-requests.html) explains how to enable code coverage gates on your own repositories.

## Examples on how the Code Coverage Gates behave

* Scenario 1: Code is modified without adding the minimum level of tests. The gates fail. ([Example PR](https://github.com/codescene-oss/code-coverage-examples-single-component/pull/1)).
* Scenario 2: A developer adds tests, making the gates pass. ([Example PR](https://github.com/codescene-oss/code-coverage-examples-single-component/pull/6)).

## Details for maintainers

### Generate build coverage - JaCoCo

mvn clean install

You'll then find the generated XML coverage report in `target/site/jacoco/jacoco.xml`.

### github workflow

There is a playground workflow [.github/workflows/test-run.yml](./.github/workflows/test-run.yml) which demonstrates how to invoke the coverage tools.
