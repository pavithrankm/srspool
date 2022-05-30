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
			  emailext (to: 'abc@gmail.com', replyTo: 'abc@gmail.com', subject: "Email Report from - '${env.JOB_NAME}' ", body: readFile("target/surefire-reports/emailable-report.html"), mimeType: 'text/html');
			}
        }
    
}
