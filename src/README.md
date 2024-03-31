# SpringBoot Example

이는 Spring Boot 애플리케이션용 REST API입니다.

## Tech Stack
- SpringBoot 3.2.3  
- Java zulu 17.0.9
- Gradle 8.4
- JPA
- H2 Database
- MySQL 8
- Azure MySQL

## Getting Started
- Repository 복제합니다.
- Ide 에서 프로젝트를 열고 Maven Dependencies를 다운로드 받습니다.
- 각 `application.yaml` 파일을 열고 `spring.datasource.url`을 수정합니다.
- Test를 실행합니다.
- 데이터베이스에 데이터가 추가 여부를 확인합니다.
- Spring Boot를 실행합니다.

## Deploy Started
Spring Boot 배포 하기 전 빌드를 수행해야 합니다.    

우선 `assemble`로 결과물로 조합해서 빌드합니다.
```bash
 ./gradlew assemble
```
test 서버 배포 실행은 다음 명령어로 수행합니다.
```bash
java -jar -Dspring.profiles.active=test build/libs/core-0.0.1-SNAPSHOT.jar
```

dev 서버 배포 실행은 다음 명령어로 수행합니다.
```bash
java -jar -Dspring.profiles.active=dev build/libs/core-0.0.1-SNAPSHOT.jar
``` 
prod 서버 배포 실행은 다음 명령어로 수행합니다.
```bash
 java -jar -Dspring.profiles.active=prod build/libs/core-0.0.1-SNAPSHOT.jar
```
## Database Started
- **Dev Environment**  
로컬 개발 시 MySQL 데이터베이스를 사용합니다.  
MySQL은 Docker를 실행해야 사용 할 수 있습니다.
> :: Docker 환경 설정은 아래에 설명 되어 있습니다.
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/metlife?serverTimezone=UTC&characterEncoding=UTF-8
    username: root
    password: root
    driver-class-name: com.mysql.cj.jdbc.Driver
```
- **Test Environment**  
테스트 개발 시 H2 데이터베이스를 설치합니다.
  - https://www.h2database.com/
    - 스프링 부트 3.x를 사용하면 **2.1.214 버전 이상** 사용해야 한다.
  - H2 데이터베이스를 실행 하기 위해서는 다음과 같이 수행합니다.
    - 웹 페이지에 `jdbc:h2:~/data/dev` 수행합니다.
    - `~/data/dev.mv.db` 파일 생성을 확인합니다.
    - application-dev.yaml url에 `jdbc:h2:tcp://localhost/~/data/dev`를 추가합니다.
    - Spring Boot를 실행합니다.

- **Prod Environment**  
프로덕트 개발 시 Azure MySQL를 `application-prod.yml`추가합니다.
```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://{myserver.mysql.database.azure.com}/{db명}
    username: userId
    password: password
```
Azure 포탈에 MySQL 사양을 추가합니다.
![image](https://github.com/jihwooon/spring-boot-example/assets/40671240/d82524e9-43bd-4861-b7d7-e83715aaacba)

IP 초기 설정을 합니다.
![image](https://github.com/jihwooon/spring-boot-example/assets/40671240/d5bf0888-0d23-4daf-8b8c-a922f434a325)

## Docker (선택 사항)
### OpenJdk 다운받기
```bash
docker pull openjdk:17
```

### Docker로 Spring 서버 실행하기
```bash
docker run -it --rm --name metlife-server -v $(pwd)/build/libs:/home/metlife-server -p 8080:80 openjdk:17 bash -c " java -jar -Dspring.profiles.active=prod home/metlife-server/core-0.0.1-SNAPSHOT.jar"
```
### Dockerfile로 빌드하기
`Dockerfile`이 있는 폴더에서 다음 명령어를 실행하여 DokerImage를 만듭니다.
```bash
docker build --tag metlife-server .
```

### Docker MySQL 실행하기
MySQL Docker 이미지 다운로드 받기
```bash
docker pull mysql:8
```

MySQL Docker 컨테이터 생성 및 실행하기
```bash
docker run --name metlife-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=metlife -d -p 3306:3306 mysql:8 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
```
MySQL Docker 컨테이너 접속하기
```bash
docker exec -it metlife-mysql bash  

bash-4.4# mysql -u root -p
Enter password: root 

Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| metlife <---       |
| mysql              |
| performance_schema |
| sys                |
+--------------------+

```
