# Weather API

This project is an API that shows daily, weekly and monthly weather reports based on the city and country information it receives from the user.

## API Features:

### Supported APIs:
- Visual Crossing Weather API

### Data:
- Daily, weekly and monthly weather reports
- Parameters like temperature, humidity, wind speed, precipitation

## API Endpoints:
- ```/api/v1/weather```: To get weather information

## Parameters:
- ```city```: City name
- ```country```: Country code (ISO 3166-1 alpha-2)
- ```range```: Report range (DAILY, WEEKLY, MONTHLY)

## Usage:
1. Specify ```city```, ```country``` and ```range``` parameters.
2. Send a GET request to the ```/api/v1/weather``` endpoint.
3. Get weather information in JSON format.

## Example:
```
curl -X GET \
-H "Accept: application/json" \
"https://api.example.com/api/v1/weather?city=Istanbul&country=TR&range=WEEKLY"
```

## Response:
<img src="../img/assignment-03/weatherapiPostman.png" width="1200" >

## Technologies
- Spring Boot
- OpenFeign
- MapStruct

## License

Distributed under the MIT License. See [`LICENSE`](LICENSE) for more details.

<!-- CONTACT -->

## Contact

### Serhat Acar

<a href="https://github.com/sserhatacarr" target="_blank">
<img  src=https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white alt=github style="margin-bottom: 20px;" />
</a>
<a href = "mailto:matnsk@outlook.com?subject = Feedback&body = Message">
<img src=https://img.shields.io/badge/send-email-email?&style=for-the-badge&logo=microsoftoutlook&color=CD5C5C alt=gmail style="margin-bottom: 20px; margin-left:20px" />
</a>
<a href="https://linkedin.com/in/sserhatacarr" target="_blank">
<img src=https://img.shields.io/badge/linkedin-%231E77B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white alt=linkedin style="margin-bottom: 20px; margin-left:20px" />
</a>  

## Talenthub Bootcamp - N11 & Patika

<div align="center">
  <a href="https://www.n11.com/">
    <img src="../img/n11-logo.png" alt="Logo" width="220" height="140">
  </a>

<h3 align="center">Company: N11.com</h3>
</div>

<div align="center">
  <a href="https://www.patika.dev/">
    <img src="../img/patika-logo.png" alt="Logo" width="350" height="300">
  </a>
<h3 align="center">Organizer: Patika.dev</h3>   
</div>

