pipeline 
{
    agent any

    stages 
	{
        stage('Build') 
		{
            steps 
			{
                echo 'Build App'
            }
		}	
			stage('Test') 
		{
            steps 
			{
                echo 'Test App'
            }
        }
		
		stage('Deploy') 
		{
            steps 
			{
                echo 'Deploy App'
            }
        }
		
		stage('Bat file ') 
		{
            steps 
			{
                echo 'Deploy App'
            }
        }
	}	
		post
		{
			always
		    {
			  emailext body: 'Summary', subject: 'Pipeline status', to: 'apoorvcreate@gmail.com'
			}
        }
    
}