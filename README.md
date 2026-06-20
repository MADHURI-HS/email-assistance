# AI Email Writer

A full-stack AI-powered email reply generator — write professional, context-aware email replies instantly using Generative AI. The project combines a Spring Boot backend, a React frontend, and a Chrome Extension for in-browser use.

---

## Features

- **AI-generated email replies** — generates professional, context-aware responses instantly
- **Chrome Extension integration** — generate replies directly inside your browser, without switching tabs
- **React frontend** — clean, responsive UI built with React and Vite
- **Non-blocking backend** — Spring Boot REST API using Spring WebFlux for asynchronous AI service calls
- **CI/CD pipeline** — GitHub Actions automatically builds and tests the backend on every push
- **Modular architecture** — frontend, backend, and browser extension are independently developed and deployed

## Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java, Spring Boot, Spring WebFlux, Maven |
| Frontend | React, Vite, Material UI (MUI), Axios |
| Browser Extension | Chrome Extension APIs, JavaScript, HTML/CSS |
| CI/CD | GitHub Actions |

## Architecture

```
User → React Frontend / Chrome Extension → Spring Boot Backend → AI Service
```

The frontend and Chrome Extension both communicate with the Spring Boot backend over REST. The backend uses Spring WebFlux to call the external AI service asynchronously, keeping the API responsive under load.

## Project Structure

```
email-assistance/
├── email-write-react/      # React frontend
├── email-writer-sb/        # Spring Boot backend
├── email_writer_ext/       # Chrome Extension
└── .github/workflows/      # CI/CD pipeline
```

## Running Locally

### Prerequisites
- Java 17+
- Node.js and npm
- Maven

### 1. Clone the repository
```bash
git clone https://github.com/MADHURI-HS/email-assistance.git
cd email-assistance
```

### 2. Backend setup
```bash
cd email-writer-sb
./mvnw spring-boot:run
```
Backend runs on `http://localhost:8080`.

### 3. Frontend setup
```bash
cd email-write-react
npm install
npm run dev
```
Frontend runs on `http://localhost:5173`.

### 4. Chrome Extension setup
1. Open Chrome and go to `chrome://extensions/`
2. Enable **Developer Mode**
3. Click **Load unpacked**
4. Select the `email_writer_ext` folder

## CI/CD

This project uses **GitHub Actions** to automatically build and test the Spring Boot backend on every push, catching integration issues early without manual intervention.

## Future Enhancements

- Multiple AI tone options
- Gmail integration
- Authentication and user accounts
- Email history storage
- Cloud deployment

## License

This project is licensed under the MIT License.

## Author

**Madhuri H S**
[GitHub](https://github.com/MADHURI-HS) · Passionate about full-stack development and AI-based applications.
