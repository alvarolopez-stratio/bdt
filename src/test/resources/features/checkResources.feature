@rest
Feature: Zookeeper steps test

  Scenario: Connection to Zk
    Given I authenticate to DCOS cluster '${DCOS_IP}' using email '${DCOS_USER:-admin}' with user '${REMOTE_USER:-operador}' and pem file 'src/test/resources/credentials/${PEM_FILE:-key.pem}'
    Given I securely send requests to 'nightly.labs.stratio.com'
    When I check that framework 'spark-fw' doesn't appear as inactive