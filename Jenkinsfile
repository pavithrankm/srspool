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
	
	       stage('Email')
		{
		steps
			{
			 emailext (to: 'pavithrankm@dckap.com', replyTo: 'kmpavithran94@gmail.com', subject: "Email Report from - '${env.JOB_NAME}' ", body: readFile("target/surefire-reports/emailable-report.html"), mimeType: 'text/html');
		}
	}

	
		
}
