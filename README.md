# 

## Model
www.msaez.io/#/courses/cna-full/24a63220-911f-11ef-a932-119b933b5d23/ddd-google-drive

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- drive
- dashboard
- indexer
- video processing
- notification
- drive
- indexer
- video processing
- notification
- dashboard


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- drive
```
 http :8088/files id="id" 
```
- dashboard
```
```
- indexer
```
 http :8088/filelocs id="id" 
```
- video processing
```
 http :8088/videos id="id" 
```
- notification
```
 http :8088/notis id="id" 
```
- drive
```
 http :8088/drives id="id" userId="userId" fileName="fileName" fileSize="fileSize" uploadDate="uploadDate" 
```
- indexer
```
 http :8088/indices id="id" fileId="fileId" userId="userId" indexResult="indexResult" 
```
- video processing
```
 http :8088/videos id="id" fileId="fileId" videoUrl="videoUrl" userId="userId" processDate="processDate" 
```
- notification
```
 http :8088/notifications id="id" userId="userId" sendMsg="sendMsg" sendDate="sendDate" 
```
- dashboard
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

