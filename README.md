# hyberus-logistic-be
# On your root code
mvn clean install
docker build -t lcarlosrincon/hiberus-logistic .
docker run -p 8020:8020 hiberus/hiberus-logistic
http://localhost:8020/logistic
#Forwarding to api doc
