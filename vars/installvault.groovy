def call() {
    ansiblePlaybook(
                        credentialsId: 'f9c2ab28-6d20-4009-b9be-dc1e30810ba1', 
                        disableHostKeyChecking: true,
                        installation: 'Ansible', 
                        inventory: '${WORKSPACE}/resources/aws_ec2.yaml',
                        playbook: '${WORKSPACE}/resources/vault.yaml', 
                        vaultTmpPath: ''
                    )

}
