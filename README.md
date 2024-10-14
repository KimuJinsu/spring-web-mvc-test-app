# Spring Web MVC 테스트 애플리케이션

이 프로젝트는 Spring Web MVC 패턴을 기반으로 한 웹 애플리케이션입니다. Spring MVC는 Model-View-Controller 아키텍처를 사용하여 비즈니스 로직과 사용자 인터페이스를 분리하여 유지보수성을 높이고, 다양한 계층에서 역할을 분리하는 데 중점을 둡니다.

## MVC 설명

- **Model**: 비즈니스 로직과 데이터베이스 상호작용을 처리하는 부분입니다. 데이터를 가공하고 컨트롤러에 전달합니다.
- **View**: JSP와 같은 템플릿 엔진을 통해 사용자가 보는 화면을 담당합니다. 컨트롤러에서 전달된 데이터를 기반으로 사용자에게 보여지는 페이지가 생성됩니다.
- **Controller**: 사용자의 요청을 처리하고, 해당 요청에 맞는 데이터를 Model로부터 받아 View에 전달하는 역할을 합니다.

## 프로젝트 구조

- `src/main/java`: Java 소스 코드가 위치하며, 주요 비즈니스 로직과 컨트롤러가 이 폴더에 포함됩니다.
  - `com.intheeast.controller`: Spring MVC 컨트롤러 클래스가 위치한 패키지입니다.
- `src/main/webapp/WEB-INF/views`: JSP 파일이 위치하며, 사용자에게 렌더링되는 뷰 페이지가 저장되어 있습니다.

## 실행 방법

1. 프로젝트를 Maven 또는 Gradle로 빌드합니다.
2. 내장된 Tomcat 또는 외부 Tomcat 서버에서 애플리케이션을 실행합니다.
3. 웹 브라우저에서 `http://localhost:8080/` 경로로 접속하여 애플리케이션을 실행합니다.

## 기술 스택

- **Spring Framework**: Spring MVC를 사용하여 웹 애플리케이션을 구현하였습니다.
- **Java**: 비즈니스 로직과 웹 애플리케이션 개발에 사용된 주요 언어입니다.
- **JSP**: 서버 사이드에서 뷰를 렌더링하는 Java Server Pages를 사용하였습니다.
- **Tomcat**: 애플리케이션 실행을 위한 서블릿 컨테이너로 Apache Tomcat을 사용하였습니다.
- **Maven/Gradle**: 프로젝트 빌드 및 의존성 관리를 위해 사용됩니다.
