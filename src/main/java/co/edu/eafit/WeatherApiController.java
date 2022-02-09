package co.edu.eafit;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "/api")
public class WeatherApiController {

    @GetMapping("/weather/{location}")
    public String getWeather(@PathVariable String location) {
        return checkWeather(location);
    }

    public String checkWeather(String location) {
        return createMessage1();
    }

    private String createMessage1(){
        return "{\n" +
                "    \"queryCost\": 1,\n" +
                "    \"latitude\": 6.24589,\n" +
                "    \"longitude\": -75.5746,\n" +
                "    \"resolvedAddress\": \"Medellín, Colombia\",\n" +
                "    \"address\": \"Medellin,ANT,CO\",\n" +
                "    \"timezone\": \"America/Bogota\",\n" +
                "    \"tzoffset\": -5.0,\n" +
                "    \"description\": \"Similar temperatures continuing with a chance of rain multiple days.\"\n"+
                "}";
    }

    private String createMessage2(){
        return "{\n" +
                "    \"queryCost\": 1,\n" +
                "    \"latitude\": 6.24589,\n" +
                "    \"longitude\": -75.5746,\n" +
                "    \"resolvedAddress\": \"Medellín, Colombia\",\n" +
                "    \"address\": \"Medellín,ANT,CO\",\n" +
                "    \"timezone\": \"America/Bogota\",\n" +
                "    \"tzoffset\": -5.0,\n" +
                "    \"description\": \"Similar temperatures continuing with a chance of rain multiple days.\",\n" +
                "    \"days\": [\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-09\",\n" +
                "            \"datetimeEpoch\": 1644382800,\n" +
                "            \"tempmax\": 73.1,\n" +
                "            \"tempmin\": 55.3,\n" +
                "            \"temp\": 63.7,\n" +
                "            \"feelslikemax\": 73.1,\n" +
                "            \"feelslikemin\": 55.3,\n" +
                "            \"feelslike\": 63.7,\n" +
                "            \"dew\": 60.2,\n" +
                "            \"humidity\": 89.6,\n" +
                "            \"precip\": 0.32,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 8.7,\n" +
                "            \"windspeed\": 17.9,\n" +
                "            \"winddir\": 215.8,\n" +
                "            \"pressure\": 1018.2,\n" +
                "            \"cloudcover\": 88.6,\n" +
                "            \"visibility\": 7.1,\n" +
                "            \"solarradiation\": 210.8,\n" +
                "            \"solarenergy\": 16.6,\n" +
                "            \"uvindex\": 3.0,\n" +
                "            \"severerisk\": 10.0,\n" +
                "            \"sunrise\": \"06:19:36\",\n" +
                "            \"sunriseEpoch\": 1644405576,\n" +
                "            \"sunset\": \"18:13:33\",\n" +
                "            \"sunsetEpoch\": 1644448413,\n" +
                "            \"moonphase\": 0.29,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with rain.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": [\n" +
                "                \"SKMD\",\n" +
                "                \"SKRG\"\n" +
                "            ],\n" +
                "            \"source\": \"comb\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644382800,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1026.0,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644386400,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1026.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": null,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644390000,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644393600,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 93.7,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 5.0,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644397200,\n" +
                "                    \"temp\": 55.3,\n" +
                "                    \"feelslike\": 55.3,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1023.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644400800,\n" +
                "                    \"temp\": 55.3,\n" +
                "                    \"feelslike\": 55.3,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644404400,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 64.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 4.6,\n" +
                "                    \"winddir\": 320.0,\n" +
                "                    \"pressure\": 1017.2,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644408000,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 64.0,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 4.8,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": null,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644411600,\n" +
                "                    \"temp\": 67.6,\n" +
                "                    \"feelslike\": 67.6,\n" +
                "                    \"humidity\": 83.21,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 0.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 208.0,\n" +
                "                    \"solarenergy\": 0.7,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644415200,\n" +
                "                    \"temp\": 69.5,\n" +
                "                    \"feelslike\": 69.5,\n" +
                "                    \"humidity\": 77.89,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 4.7,\n" +
                "                    \"winddir\": 22.0,\n" +
                "                    \"pressure\": 1021.2,\n" +
                "                    \"visibility\": 4.4,\n" +
                "                    \"cloudcover\": 86.7,\n" +
                "                    \"solarradiation\": 316.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644418800,\n" +
                "                    \"temp\": 71.3,\n" +
                "                    \"feelslike\": 71.3,\n" +
                "                    \"humidity\": 68.74,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 9.1,\n" +
                "                    \"winddir\": 342.0,\n" +
                "                    \"pressure\": 1022.1,\n" +
                "                    \"visibility\": 5.6,\n" +
                "                    \"cloudcover\": 86.7,\n" +
                "                    \"solarradiation\": 419.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644422400,\n" +
                "                    \"temp\": 73.1,\n" +
                "                    \"feelslike\": 73.1,\n" +
                "                    \"humidity\": 64.68,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 15.6,\n" +
                "                    \"winddir\": 350.0,\n" +
                "                    \"pressure\": 1021.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 523.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644426000,\n" +
                "                    \"temp\": 73.0,\n" +
                "                    \"feelslike\": 73.0,\n" +
                "                    \"humidity\": 64.96,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.8,\n" +
                "                    \"windspeed\": 15.9,\n" +
                "                    \"winddir\": 342.0,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 51.3,\n" +
                "                    \"solarradiation\": 607.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644429600,\n" +
                "                    \"temp\": 71.1,\n" +
                "                    \"feelslike\": 71.1,\n" +
                "                    \"humidity\": 69.34,\n" +
                "                    \"dew\": 60.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 17.9,\n" +
                "                    \"winddir\": 11.0,\n" +
                "                    \"pressure\": 1019.2,\n" +
                "                    \"visibility\": 6.1,\n" +
                "                    \"cloudcover\": 51.3,\n" +
                "                    \"solarradiation\": 642.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644433200,\n" +
                "                    \"temp\": 64.2,\n" +
                "                    \"feelslike\": 64.2,\n" +
                "                    \"humidity\": 93.26,\n" +
                "                    \"dew\": 62.2,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 4.7,\n" +
                "                    \"winddir\": 332.0,\n" +
                "                    \"pressure\": 1019.2,\n" +
                "                    \"visibility\": 5.0,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": 528.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644436800,\n" +
                "                    \"temp\": 65.9,\n" +
                "                    \"feelslike\": 65.9,\n" +
                "                    \"humidity\": 93.31,\n" +
                "                    \"dew\": 63.9,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": 223.0,\n" +
                "                    \"pressure\": 1018.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": 423.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644440400,\n" +
                "                    \"temp\": 66.8,\n" +
                "                    \"feelslike\": 66.8,\n" +
                "                    \"humidity\": 82.79,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 5.6,\n" +
                "                    \"windspeed\": 3.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 10.8,\n" +
                "                    \"cloudcover\": 96.2,\n" +
                "                    \"solarradiation\": 328.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644444000,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 90.96,\n" +
                "                    \"dew\": 61.8,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 97.7,\n" +
                "                    \"solarradiation\": 258.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644447600,\n" +
                "                    \"temp\": 63.9,\n" +
                "                    \"feelslike\": 63.9,\n" +
                "                    \"humidity\": 90.36,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 5.4,\n" +
                "                    \"cloudcover\": 99.1,\n" +
                "                    \"solarradiation\": 210.0,\n" +
                "                    \"solarenergy\": 0.8,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644451200,\n" +
                "                    \"temp\": 63.1,\n" +
                "                    \"feelslike\": 63.1,\n" +
                "                    \"humidity\": 92.66,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 9.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 175.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644454800,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 94.43,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 8.7,\n" +
                "                    \"windspeed\": 4.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644458400,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 96.25,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 6.7,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 12.7,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644462000,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 11.8,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644465600,\n" +
                "                    \"temp\": 61.4,\n" +
                "                    \"feelslike\": 61.4,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }" +
                "    ],\n" +
                "    \"alerts\": [],\n" +
                "    \"stations\": {\n" +
                "        \"SKMD\": {\n" +
                "            \"distance\": 3348.0,\n" +
                "            \"latitude\": 6.22,\n" +
                "            \"longitude\": -75.59,\n" +
                "            \"useCount\": 0,\n" +
                "            \"id\": \"SKMD\",\n" +
                "            \"name\": \"SKMD\",\n" +
                "            \"quality\": 19,\n" +
                "            \"contribution\": 0.0\n" +
                "        },\n" +
                "        \"SKRG\": {\n" +
                "            \"distance\": 17603.0,\n" +
                "            \"latitude\": 6.18,\n" +
                "            \"longitude\": -75.43,\n" +
                "            \"useCount\": 0,\n" +
                "            \"id\": \"SKRG\",\n" +
                "            \"name\": \"SKRG\",\n" +
                "            \"quality\": 49,\n" +
                "            \"contribution\": 0.0\n" +
                "        }\n" +
                "    },\n" +
                "    \"currentConditions\": {\n" +
                "        \"datetime\": \"15:00:00\",\n" +
                "        \"datetimeEpoch\": 1644436800,\n" +
                "        \"temp\": 65.9,\n" +
                "        \"feelslike\": 65.9,\n" +
                "        \"humidity\": 93.3,\n" +
                "        \"dew\": 63.9,\n" +
                "        \"precip\": 0.02,\n" +
                "        \"precipprob\": null,\n" +
                "        \"snow\": null,\n" +
                "        \"snowdepth\": 0.0,\n" +
                "        \"preciptype\": null,\n" +
                "        \"windgust\": null,\n" +
                "        \"windspeed\": 3.4,\n" +
                "        \"winddir\": 223.0,\n" +
                "        \"pressure\": 1018.2,\n" +
                "        \"visibility\": 6.2,\n" +
                "        \"cloudcover\": 88.4,\n" +
                "        \"solarradiation\": 423.0,\n" +
                "        \"solarenergy\": 1.5,\n" +
                "        \"uvindex\": 0.0,\n" +
                "        \"conditions\": \"Rain, Partially cloudy\",\n" +
                "        \"icon\": \"rain\",\n" +
                "        \"stations\": [\n" +
                "            \"SKMD\",\n" +
                "            \"SKRG\"\n" +
                "        ],\n" +
                "        \"sunrise\": \"06:19:36\",\n" +
                "        \"sunriseEpoch\": 1644405576,\n" +
                "        \"sunset\": \"18:13:33\",\n" +
                "        \"sunsetEpoch\": 1644448413,\n" +
                "        \"moonphase\": 0.29\n" +
                "    }\n" +
                "}";
    }

    private String createMessage3(){
        return "{\n" +
                "    \"queryCost\": 1,\n" +
                "    \"latitude\": 6.24589,\n" +
                "    \"longitude\": -75.5746,\n" +
                "    \"resolvedAddress\": \"Medellín, Colombia\",\n" +
                "    \"address\": \"Medellín,ANT,CO\",\n" +
                "    \"timezone\": \"America/Bogota\",\n" +
                "    \"tzoffset\": -5.0,\n" +
                "    \"description\": \"Similar temperatures continuing with a chance of rain multiple days.\",\n" +
                "    \"days\": [\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-09\",\n" +
                "            \"datetimeEpoch\": 1644382800,\n" +
                "            \"tempmax\": 73.1,\n" +
                "            \"tempmin\": 55.3,\n" +
                "            \"temp\": 63.7,\n" +
                "            \"feelslikemax\": 73.1,\n" +
                "            \"feelslikemin\": 55.3,\n" +
                "            \"feelslike\": 63.7,\n" +
                "            \"dew\": 60.2,\n" +
                "            \"humidity\": 89.6,\n" +
                "            \"precip\": 0.32,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 8.7,\n" +
                "            \"windspeed\": 17.9,\n" +
                "            \"winddir\": 215.8,\n" +
                "            \"pressure\": 1018.2,\n" +
                "            \"cloudcover\": 88.6,\n" +
                "            \"visibility\": 7.1,\n" +
                "            \"solarradiation\": 210.8,\n" +
                "            \"solarenergy\": 16.6,\n" +
                "            \"uvindex\": 3.0,\n" +
                "            \"severerisk\": 10.0,\n" +
                "            \"sunrise\": \"06:19:36\",\n" +
                "            \"sunriseEpoch\": 1644405576,\n" +
                "            \"sunset\": \"18:13:33\",\n" +
                "            \"sunsetEpoch\": 1644448413,\n" +
                "            \"moonphase\": 0.29,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with rain.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": [\n" +
                "                \"SKMD\",\n" +
                "                \"SKRG\"\n" +
                "            ],\n" +
                "            \"source\": \"comb\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644382800,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1026.0,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644386400,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1026.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": null,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644390000,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644393600,\n" +
                "                    \"temp\": 57.1,\n" +
                "                    \"feelslike\": 57.1,\n" +
                "                    \"humidity\": 93.7,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 5.0,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644397200,\n" +
                "                    \"temp\": 55.3,\n" +
                "                    \"feelslike\": 55.3,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1023.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644400800,\n" +
                "                    \"temp\": 55.3,\n" +
                "                    \"feelslike\": 55.3,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1024.0,\n" +
                "                    \"visibility\": 3.7,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644404400,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 64.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 4.6,\n" +
                "                    \"winddir\": 320.0,\n" +
                "                    \"pressure\": 1017.2,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644408000,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 100.0,\n" +
                "                    \"dew\": 64.0,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 4.8,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": null,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644411600,\n" +
                "                    \"temp\": 67.6,\n" +
                "                    \"feelslike\": 67.6,\n" +
                "                    \"humidity\": 83.21,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 0.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 208.0,\n" +
                "                    \"solarenergy\": 0.7,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644415200,\n" +
                "                    \"temp\": 69.5,\n" +
                "                    \"feelslike\": 69.5,\n" +
                "                    \"humidity\": 77.89,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 4.7,\n" +
                "                    \"winddir\": 22.0,\n" +
                "                    \"pressure\": 1021.2,\n" +
                "                    \"visibility\": 4.4,\n" +
                "                    \"cloudcover\": 86.7,\n" +
                "                    \"solarradiation\": 316.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644418800,\n" +
                "                    \"temp\": 71.3,\n" +
                "                    \"feelslike\": 71.3,\n" +
                "                    \"humidity\": 68.74,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 9.1,\n" +
                "                    \"winddir\": 342.0,\n" +
                "                    \"pressure\": 1022.1,\n" +
                "                    \"visibility\": 5.6,\n" +
                "                    \"cloudcover\": 86.7,\n" +
                "                    \"solarradiation\": 419.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644422400,\n" +
                "                    \"temp\": 73.1,\n" +
                "                    \"feelslike\": 73.1,\n" +
                "                    \"humidity\": 64.68,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 15.6,\n" +
                "                    \"winddir\": 350.0,\n" +
                "                    \"pressure\": 1021.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 88.0,\n" +
                "                    \"solarradiation\": 523.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644426000,\n" +
                "                    \"temp\": 73.0,\n" +
                "                    \"feelslike\": 73.0,\n" +
                "                    \"humidity\": 64.96,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.8,\n" +
                "                    \"windspeed\": 15.9,\n" +
                "                    \"winddir\": 342.0,\n" +
                "                    \"pressure\": 1020.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 51.3,\n" +
                "                    \"solarradiation\": 607.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644429600,\n" +
                "                    \"temp\": 71.1,\n" +
                "                    \"feelslike\": 71.1,\n" +
                "                    \"humidity\": 69.34,\n" +
                "                    \"dew\": 60.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 17.9,\n" +
                "                    \"winddir\": 11.0,\n" +
                "                    \"pressure\": 1019.2,\n" +
                "                    \"visibility\": 6.1,\n" +
                "                    \"cloudcover\": 51.3,\n" +
                "                    \"solarradiation\": 642.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644433200,\n" +
                "                    \"temp\": 64.2,\n" +
                "                    \"feelslike\": 64.2,\n" +
                "                    \"humidity\": 93.26,\n" +
                "                    \"dew\": 62.2,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 4.7,\n" +
                "                    \"winddir\": 332.0,\n" +
                "                    \"pressure\": 1019.2,\n" +
                "                    \"visibility\": 5.0,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": 528.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644436800,\n" +
                "                    \"temp\": 65.9,\n" +
                "                    \"feelslike\": 65.9,\n" +
                "                    \"humidity\": 93.31,\n" +
                "                    \"dew\": 63.9,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": 223.0,\n" +
                "                    \"pressure\": 1018.2,\n" +
                "                    \"visibility\": 6.2,\n" +
                "                    \"cloudcover\": 88.4,\n" +
                "                    \"solarradiation\": 423.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": [\n" +
                "                        \"SKMD\",\n" +
                "                        \"SKRG\"\n" +
                "                    ],\n" +
                "                    \"source\": \"obs\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644440400,\n" +
                "                    \"temp\": 66.8,\n" +
                "                    \"feelslike\": 66.8,\n" +
                "                    \"humidity\": 82.79,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 5.6,\n" +
                "                    \"windspeed\": 3.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 10.8,\n" +
                "                    \"cloudcover\": 96.2,\n" +
                "                    \"solarradiation\": 328.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644444000,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 90.96,\n" +
                "                    \"dew\": 61.8,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 97.7,\n" +
                "                    \"solarradiation\": 258.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644447600,\n" +
                "                    \"temp\": 63.9,\n" +
                "                    \"feelslike\": 63.9,\n" +
                "                    \"humidity\": 90.36,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 5.4,\n" +
                "                    \"cloudcover\": 99.1,\n" +
                "                    \"solarradiation\": 210.0,\n" +
                "                    \"solarenergy\": 0.8,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644451200,\n" +
                "                    \"temp\": 63.1,\n" +
                "                    \"feelslike\": 63.1,\n" +
                "                    \"humidity\": 92.66,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 9.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 175.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644454800,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 94.43,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 8.7,\n" +
                "                    \"windspeed\": 4.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644458400,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 96.25,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 6.7,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 12.7,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644462000,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 11.8,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644465600,\n" +
                "                    \"temp\": 61.4,\n" +
                "                    \"feelslike\": 61.4,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-10\",\n" +
                "            \"datetimeEpoch\": 1644469200,\n" +
                "            \"tempmax\": 77.1,\n" +
                "            \"tempmin\": 59.8,\n" +
                "            \"temp\": 65.7,\n" +
                "            \"feelslikemax\": 77.1,\n" +
                "            \"feelslikemin\": 59.8,\n" +
                "            \"feelslike\": 65.7,\n" +
                "            \"dew\": 59.8,\n" +
                "            \"humidity\": 83.3,\n" +
                "            \"precip\": 0.35,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 5.1,\n" +
                "            \"windspeed\": 2.9,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.8,\n" +
                "            \"cloudcover\": 96.5,\n" +
                "            \"visibility\": 12.8,\n" +
                "            \"solarradiation\": 231.3,\n" +
                "            \"solarenergy\": 19.9,\n" +
                "            \"uvindex\": 9.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:19:29\",\n" +
                "            \"sunriseEpoch\": 1644491969,\n" +
                "            \"sunset\": \"18:13:42\",\n" +
                "            \"sunsetEpoch\": 1644534822,\n" +
                "            \"moonphase\": 0.34,\n" +
                "            \"conditions\": \"Rain, Overcast\",\n" +
                "            \"description\": \"Cloudy skies throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644469200,\n" +
                "                    \"temp\": 61.4,\n" +
                "                    \"feelslike\": 61.4,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644472800,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 97.48,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 12.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644476400,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 97.48,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 8.5,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644480000,\n" +
                "                    \"temp\": 60.5,\n" +
                "                    \"feelslike\": 60.5,\n" +
                "                    \"humidity\": 97.47,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 5.1,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 1.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644483600,\n" +
                "                    \"temp\": 60.2,\n" +
                "                    \"feelslike\": 60.2,\n" +
                "                    \"humidity\": 98.1,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 1.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644487200,\n" +
                "                    \"temp\": 60.2,\n" +
                "                    \"feelslike\": 60.2,\n" +
                "                    \"humidity\": 97.47,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644490800,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 97.46,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644494400,\n" +
                "                    \"temp\": 60.3,\n" +
                "                    \"feelslike\": 60.3,\n" +
                "                    \"humidity\": 96.23,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 19.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 3.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644498000,\n" +
                "                    \"temp\": 62.7,\n" +
                "                    \"feelslike\": 62.7,\n" +
                "                    \"humidity\": 91.47,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 119.0,\n" +
                "                    \"solarenergy\": 0.4,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644501600,\n" +
                "                    \"temp\": 64.3,\n" +
                "                    \"feelslike\": 64.3,\n" +
                "                    \"humidity\": 88.1,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 162.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644505200,\n" +
                "                    \"temp\": 67.7,\n" +
                "                    \"feelslike\": 67.7,\n" +
                "                    \"humidity\": 79.25,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 254.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644508800,\n" +
                "                    \"temp\": 70.6,\n" +
                "                    \"feelslike\": 70.6,\n" +
                "                    \"humidity\": 70.0,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.8,\n" +
                "                    \"solarradiation\": 333.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644512400,\n" +
                "                    \"temp\": 72.2,\n" +
                "                    \"feelslike\": 72.2,\n" +
                "                    \"humidity\": 65.0,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.8,\n" +
                "                    \"solarradiation\": 398.0,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644516000,\n" +
                "                    \"temp\": 75.1,\n" +
                "                    \"feelslike\": 75.1,\n" +
                "                    \"humidity\": 58.63,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 84.1,\n" +
                "                    \"solarradiation\": 472.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644519600,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 54.14,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.9,\n" +
                "                    \"solarradiation\": 853.0,\n" +
                "                    \"solarenergy\": 3.1,\n" +
                "                    \"uvindex\": 9.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644523200,\n" +
                "                    \"temp\": 77.1,\n" +
                "                    \"feelslike\": 77.1,\n" +
                "                    \"humidity\": 51.8,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 75.7,\n" +
                "                    \"solarradiation\": 788.0,\n" +
                "                    \"solarenergy\": 2.8,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644526800,\n" +
                "                    \"temp\": 76.0,\n" +
                "                    \"feelslike\": 76.0,\n" +
                "                    \"humidity\": 53.0,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 81.6,\n" +
                "                    \"solarradiation\": 690.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644530400,\n" +
                "                    \"temp\": 73.3,\n" +
                "                    \"feelslike\": 73.3,\n" +
                "                    \"humidity\": 65.12,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 14.2,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 588.0,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644534000,\n" +
                "                    \"temp\": 66.1,\n" +
                "                    \"feelslike\": 66.1,\n" +
                "                    \"humidity\": 81.7,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 7.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 486.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644537600,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 90.32,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 8.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 405.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644541200,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 92.05,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644544800,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 92.64,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644548400,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 93.23,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644552000,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 94.42,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-11\",\n" +
                "            \"datetimeEpoch\": 1644555600,\n" +
                "            \"tempmax\": 76.7,\n" +
                "            \"tempmin\": 59.6,\n" +
                "            \"temp\": 65.9,\n" +
                "            \"feelslikemax\": 76.7,\n" +
                "            \"feelslikemin\": 59.6,\n" +
                "            \"feelslike\": 65.9,\n" +
                "            \"dew\": 59.8,\n" +
                "            \"humidity\": 82.7,\n" +
                "            \"precip\": 0.07,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 4.3,\n" +
                "            \"windspeed\": 4.0,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1010.9,\n" +
                "            \"cloudcover\": 97.5,\n" +
                "            \"visibility\": 14.4,\n" +
                "            \"solarradiation\": 220.4,\n" +
                "            \"solarenergy\": 19.0,\n" +
                "            \"uvindex\": 8.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:19:20\",\n" +
                "            \"sunriseEpoch\": 1644578360,\n" +
                "            \"sunset\": \"18:13:51\",\n" +
                "            \"sunsetEpoch\": 1644621231,\n" +
                "            \"moonphase\": 0.38,\n" +
                "            \"conditions\": \"Rain, Overcast\",\n" +
                "            \"description\": \"Cloudy skies throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644555600,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 94.42,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 97.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644559200,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 89.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644562800,\n" +
                "                    \"temp\": 60.3,\n" +
                "                    \"feelslike\": 60.3,\n" +
                "                    \"humidity\": 96.85,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644566400,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 97.46,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644570000,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 97.46,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644573600,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 97.47,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 9.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644577200,\n" +
                "                    \"temp\": 60.2,\n" +
                "                    \"feelslike\": 60.2,\n" +
                "                    \"humidity\": 97.47,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644580800,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 14.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.1,\n" +
                "                    \"solarradiation\": 2.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644584400,\n" +
                "                    \"temp\": 62.7,\n" +
                "                    \"feelslike\": 62.7,\n" +
                "                    \"humidity\": 92.06,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 90.5,\n" +
                "                    \"solarradiation\": 94.0,\n" +
                "                    \"solarenergy\": 0.3,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644588000,\n" +
                "                    \"temp\": 65.6,\n" +
                "                    \"feelslike\": 65.6,\n" +
                "                    \"humidity\": 85.39,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 173.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644591600,\n" +
                "                    \"temp\": 69.5,\n" +
                "                    \"feelslike\": 69.5,\n" +
                "                    \"humidity\": 74.03,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 271.0,\n" +
                "                    \"solarenergy\": 1.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644595200,\n" +
                "                    \"temp\": 72.8,\n" +
                "                    \"feelslike\": 72.8,\n" +
                "                    \"humidity\": 64.64,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 363.0,\n" +
                "                    \"solarenergy\": 1.3,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644598800,\n" +
                "                    \"temp\": 74.0,\n" +
                "                    \"feelslike\": 74.0,\n" +
                "                    \"humidity\": 60.39,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 418.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644602400,\n" +
                "                    \"temp\": 74.9,\n" +
                "                    \"feelslike\": 74.9,\n" +
                "                    \"humidity\": 57.85,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.8,\n" +
                "                    \"solarradiation\": 450.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644606000,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 53.79,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 3.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.9,\n" +
                "                    \"solarradiation\": 789.0,\n" +
                "                    \"solarenergy\": 2.8,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644609600,\n" +
                "                    \"temp\": 75.6,\n" +
                "                    \"feelslike\": 75.6,\n" +
                "                    \"humidity\": 55.4,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.3,\n" +
                "                    \"windspeed\": 4.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 727.0,\n" +
                "                    \"solarenergy\": 2.6,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644613200,\n" +
                "                    \"temp\": 73.7,\n" +
                "                    \"feelslike\": 73.7,\n" +
                "                    \"humidity\": 61.52,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 633.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644616800,\n" +
                "                    \"temp\": 70.6,\n" +
                "                    \"feelslike\": 70.6,\n" +
                "                    \"humidity\": 74.6,\n" +
                "                    \"dew\": 62.1,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 8.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 543.0,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644620400,\n" +
                "                    \"temp\": 66.1,\n" +
                "                    \"feelslike\": 66.1,\n" +
                "                    \"humidity\": 83.28,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.6,\n" +
                "                    \"solarradiation\": 451.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644624000,\n" +
                "                    \"temp\": 64.3,\n" +
                "                    \"feelslike\": 64.3,\n" +
                "                    \"humidity\": 86.42,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 97.6,\n" +
                "                    \"solarradiation\": 376.0,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644627600,\n" +
                "                    \"temp\": 63.8,\n" +
                "                    \"feelslike\": 63.8,\n" +
                "                    \"humidity\": 87.51,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 80.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644631200,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 90.32,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 98.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644634800,\n" +
                "                    \"temp\": 62.5,\n" +
                "                    \"feelslike\": 62.5,\n" +
                "                    \"humidity\": 90.88,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644638400,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 92.02,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-12\",\n" +
                "            \"datetimeEpoch\": 1644642000,\n" +
                "            \"tempmax\": 81.9,\n" +
                "            \"tempmin\": 59.1,\n" +
                "            \"temp\": 68.4,\n" +
                "            \"feelslikemax\": 81.5,\n" +
                "            \"feelslikemin\": 59.1,\n" +
                "            \"feelslike\": 68.4,\n" +
                "            \"dew\": 58.8,\n" +
                "            \"humidity\": 74.8,\n" +
                "            \"precip\": 0.04,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 4.7,\n" +
                "            \"windspeed\": 3.4,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1010.1,\n" +
                "            \"cloudcover\": 67.4,\n" +
                "            \"visibility\": 14.9,\n" +
                "            \"solarradiation\": 288.6,\n" +
                "            \"solarenergy\": 25.0,\n" +
                "            \"uvindex\": 9.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:19:10\",\n" +
                "            \"sunriseEpoch\": 1644664750,\n" +
                "            \"sunset\": \"18:14:00\",\n" +
                "            \"sunsetEpoch\": 1644707640,\n" +
                "            \"moonphase\": 0.42,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644642000,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 93.19,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644645600,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 93.79,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644649200,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 94.4,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644652800,\n" +
                "                    \"temp\": 60.2,\n" +
                "                    \"feelslike\": 60.2,\n" +
                "                    \"humidity\": 94.99,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644656400,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 94.99,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644660000,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 95.6,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 45.3,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644663600,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 96.21,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 29.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644667200,\n" +
                "                    \"temp\": 60.2,\n" +
                "                    \"feelslike\": 60.2,\n" +
                "                    \"humidity\": 93.17,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 47.9,\n" +
                "                    \"solarradiation\": 3.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644670800,\n" +
                "                    \"temp\": 63.4,\n" +
                "                    \"feelslike\": 63.4,\n" +
                "                    \"humidity\": 87.49,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 32.5,\n" +
                "                    \"solarradiation\": 163.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644674400,\n" +
                "                    \"temp\": 68.1,\n" +
                "                    \"feelslike\": 68.1,\n" +
                "                    \"humidity\": 76.3,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 54.5,\n" +
                "                    \"solarradiation\": 297.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644678000,\n" +
                "                    \"temp\": 72.9,\n" +
                "                    \"feelslike\": 72.9,\n" +
                "                    \"humidity\": 63.44,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 60.5,\n" +
                "                    \"solarradiation\": 430.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644681600,\n" +
                "                    \"temp\": 76.4,\n" +
                "                    \"feelslike\": 76.4,\n" +
                "                    \"humidity\": 54.44,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 20.7,\n" +
                "                    \"solarradiation\": 542.0,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644685200,\n" +
                "                    \"temp\": 79.1,\n" +
                "                    \"feelslike\": 79.1,\n" +
                "                    \"humidity\": 47.9,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 14.3,\n" +
                "                    \"solarradiation\": 632.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644688800,\n" +
                "                    \"temp\": 81.1,\n" +
                "                    \"feelslike\": 81.0,\n" +
                "                    \"humidity\": 43.47,\n" +
                "                    \"dew\": 56.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 16.0,\n" +
                "                    \"solarradiation\": 690.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644692400,\n" +
                "                    \"temp\": 81.9,\n" +
                "                    \"feelslike\": 81.5,\n" +
                "                    \"humidity\": 41.13,\n" +
                "                    \"dew\": 56.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 11.7,\n" +
                "                    \"solarradiation\": 921.0,\n" +
                "                    \"solarenergy\": 3.3,\n" +
                "                    \"uvindex\": 9.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644696000,\n" +
                "                    \"temp\": 81.4,\n" +
                "                    \"feelslike\": 81.1,\n" +
                "                    \"humidity\": 41.05,\n" +
                "                    \"dew\": 55.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1005.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 39.8,\n" +
                "                    \"solarradiation\": 863.0,\n" +
                "                    \"solarenergy\": 3.1,\n" +
                "                    \"uvindex\": 9.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644699600,\n" +
                "                    \"temp\": 79.6,\n" +
                "                    \"feelslike\": 79.6,\n" +
                "                    \"humidity\": 44.39,\n" +
                "                    \"dew\": 56.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1005.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 82.7,\n" +
                "                    \"solarradiation\": 767.0,\n" +
                "                    \"solarenergy\": 2.8,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644703200,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 55.91,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1005.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.5,\n" +
                "                    \"solarradiation\": 646.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644706800,\n" +
                "                    \"temp\": 70.4,\n" +
                "                    \"feelslike\": 70.4,\n" +
                "                    \"humidity\": 69.09,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.7,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.7,\n" +
                "                    \"solarradiation\": 530.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644710400,\n" +
                "                    \"temp\": 67.9,\n" +
                "                    \"feelslike\": 67.9,\n" +
                "                    \"humidity\": 74.83,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 14.2,\n" +
                "                    \"cloudcover\": 93.6,\n" +
                "                    \"solarradiation\": 442.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644714000,\n" +
                "                    \"temp\": 65.9,\n" +
                "                    \"feelslike\": 65.9,\n" +
                "                    \"humidity\": 82.21,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 14.9,\n" +
                "                    \"cloudcover\": 91.6,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644717600,\n" +
                "                    \"temp\": 65.4,\n" +
                "                    \"feelslike\": 65.4,\n" +
                "                    \"humidity\": 84.84,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 92.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644721200,\n" +
                "                    \"temp\": 65.0,\n" +
                "                    \"feelslike\": 65.0,\n" +
                "                    \"humidity\": 86.46,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644724800,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 86.99,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-13\",\n" +
                "            \"datetimeEpoch\": 1644728400,\n" +
                "            \"tempmax\": 80.0,\n" +
                "            \"tempmin\": 61.2,\n" +
                "            \"temp\": 67.2,\n" +
                "            \"feelslikemax\": 80.0,\n" +
                "            \"feelslikemin\": 61.2,\n" +
                "            \"feelslike\": 67.2,\n" +
                "            \"dew\": 60.8,\n" +
                "            \"humidity\": 81.7,\n" +
                "            \"precip\": 0.55,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.1,\n" +
                "            \"windspeed\": 2.9,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.0,\n" +
                "            \"cloudcover\": 79.1,\n" +
                "            \"visibility\": 11.8,\n" +
                "            \"solarradiation\": 266.6,\n" +
                "            \"solarenergy\": 22.9,\n" +
                "            \"uvindex\": 9.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:19:00\",\n" +
                "            \"sunriseEpoch\": 1644751140,\n" +
                "            \"sunset\": \"18:14:07\",\n" +
                "            \"sunsetEpoch\": 1644794047,\n" +
                "            \"moonphase\": 0.45,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644728400,\n" +
                "                    \"temp\": 63.2,\n" +
                "                    \"feelslike\": 63.2,\n" +
                "                    \"humidity\": 89.75,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 98.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644732000,\n" +
                "                    \"temp\": 63.1,\n" +
                "                    \"feelslike\": 63.1,\n" +
                "                    \"humidity\": 90.32,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 61.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644735600,\n" +
                "                    \"temp\": 63.1,\n" +
                "                    \"feelslike\": 63.1,\n" +
                "                    \"humidity\": 90.9,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 60.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644739200,\n" +
                "                    \"temp\": 62.5,\n" +
                "                    \"feelslike\": 62.5,\n" +
                "                    \"humidity\": 92.05,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 85.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644742800,\n" +
                "                    \"temp\": 62.0,\n" +
                "                    \"feelslike\": 62.0,\n" +
                "                    \"humidity\": 92.63,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 79.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644746400,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 93.81,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.4,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 86.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644750000,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 94.41,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 13.0,\n" +
                "                    \"cloudcover\": 79.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644753600,\n" +
                "                    \"temp\": 62.0,\n" +
                "                    \"feelslike\": 62.0,\n" +
                "                    \"humidity\": 93.22,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 73.6,\n" +
                "                    \"solarradiation\": 3.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644757200,\n" +
                "                    \"temp\": 65.0,\n" +
                "                    \"feelslike\": 65.0,\n" +
                "                    \"humidity\": 88.13,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 35.6,\n" +
                "                    \"solarradiation\": 179.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644760800,\n" +
                "                    \"temp\": 68.6,\n" +
                "                    \"feelslike\": 68.6,\n" +
                "                    \"humidity\": 79.82,\n" +
                "                    \"dew\": 62.1,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 14.1,\n" +
                "                    \"cloudcover\": 80.8,\n" +
                "                    \"solarradiation\": 313.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644764400,\n" +
                "                    \"temp\": 72.4,\n" +
                "                    \"feelslike\": 72.4,\n" +
                "                    \"humidity\": 69.74,\n" +
                "                    \"dew\": 62.0,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 78.8,\n" +
                "                    \"solarradiation\": 436.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644768000,\n" +
                "                    \"temp\": 75.3,\n" +
                "                    \"feelslike\": 75.3,\n" +
                "                    \"humidity\": 62.52,\n" +
                "                    \"dew\": 61.6,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 96.6,\n" +
                "                    \"solarradiation\": 540.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644771600,\n" +
                "                    \"temp\": 77.4,\n" +
                "                    \"feelslike\": 77.4,\n" +
                "                    \"humidity\": 56.73,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 74.9,\n" +
                "                    \"solarradiation\": 622.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644775200,\n" +
                "                    \"temp\": 80.0,\n" +
                "                    \"feelslike\": 80.0,\n" +
                "                    \"humidity\": 50.57,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 28.6,\n" +
                "                    \"solarradiation\": 684.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644778800,\n" +
                "                    \"temp\": 79.2,\n" +
                "                    \"feelslike\": 79.2,\n" +
                "                    \"humidity\": 51.45,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 84.3,\n" +
                "                    \"solarradiation\": 930.0,\n" +
                "                    \"solarenergy\": 3.3,\n" +
                "                    \"uvindex\": 9.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644782400,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 59.22,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.9,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 8.4,\n" +
                "                    \"cloudcover\": 91.9,\n" +
                "                    \"solarradiation\": 796.0,\n" +
                "                    \"solarenergy\": 2.9,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644786000,\n" +
                "                    \"temp\": 72.8,\n" +
                "                    \"feelslike\": 72.8,\n" +
                "                    \"humidity\": 70.67,\n" +
                "                    \"dew\": 62.7,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 9.2,\n" +
                "                    \"cloudcover\": 92.9,\n" +
                "                    \"solarradiation\": 636.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644789600,\n" +
                "                    \"temp\": 69.3,\n" +
                "                    \"feelslike\": 69.3,\n" +
                "                    \"humidity\": 78.37,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 8.7,\n" +
                "                    \"cloudcover\": 97.4,\n" +
                "                    \"solarradiation\": 505.0,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644793200,\n" +
                "                    \"temp\": 65.7,\n" +
                "                    \"feelslike\": 65.7,\n" +
                "                    \"humidity\": 86.5,\n" +
                "                    \"dew\": 61.6,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 3.9,\n" +
                "                    \"cloudcover\": 86.3,\n" +
                "                    \"solarradiation\": 412.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644796800,\n" +
                "                    \"temp\": 63.8,\n" +
                "                    \"feelslike\": 63.8,\n" +
                "                    \"humidity\": 90.35,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 3.4,\n" +
                "                    \"cloudcover\": 99.6,\n" +
                "                    \"solarradiation\": 343.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644800400,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 93.83,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.07,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 3.9,\n" +
                "                    \"cloudcover\": 83.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644804000,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 94.43,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 8.3,\n" +
                "                    \"cloudcover\": 59.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644807600,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 95.02,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.1,\n" +
                "                    \"cloudcover\": 96.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644811200,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 8.5,\n" +
                "                    \"cloudcover\": 84.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-14\",\n" +
                "            \"datetimeEpoch\": 1644814800,\n" +
                "            \"tempmax\": 74.2,\n" +
                "            \"tempmin\": 60.7,\n" +
                "            \"temp\": 63.1,\n" +
                "            \"feelslikemax\": 74.2,\n" +
                "            \"feelslikemin\": 60.7,\n" +
                "            \"feelslike\": 63.1,\n" +
                "            \"dew\": 60.6,\n" +
                "            \"humidity\": 92.5,\n" +
                "            \"precip\": 0.77,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 2.0,\n" +
                "            \"windspeed\": 2.2,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1012.7,\n" +
                "            \"cloudcover\": 90.0,\n" +
                "            \"visibility\": 7.0,\n" +
                "            \"solarradiation\": 115.2,\n" +
                "            \"solarenergy\": 5.4,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:18:49\",\n" +
                "            \"sunriseEpoch\": 1644837529,\n" +
                "            \"sunset\": \"18:14:14\",\n" +
                "            \"sunsetEpoch\": 1644880454,\n" +
                "            \"moonphase\": 0.48,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644814800,\n" +
                "                    \"temp\": 61.4,\n" +
                "                    \"feelslike\": 61.4,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 9.1,\n" +
                "                    \"cloudcover\": 98.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644818400,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 97.48,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 7.0,\n" +
                "                    \"cloudcover\": 90.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644822000,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 98.1,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 4.3,\n" +
                "                    \"cloudcover\": 88.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644825600,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 97.48,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 3.8,\n" +
                "                    \"cloudcover\": 84.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644829200,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 98.1,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 4.6,\n" +
                "                    \"cloudcover\": 82.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644832800,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 99.36,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.4,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 7.6,\n" +
                "                    \"cloudcover\": 89.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644836400,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 98.1,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 7.1,\n" +
                "                    \"cloudcover\": 89.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644840000,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 98.1,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 85.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 3.5,\n" +
                "                    \"cloudcover\": 95.0,\n" +
                "                    \"solarradiation\": 1.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644843600,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 97.1,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 88.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 0.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 7.3,\n" +
                "                    \"cloudcover\": 89.5,\n" +
                "                    \"solarradiation\": 17.0,\n" +
                "                    \"solarenergy\": 0.1,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644847200,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 96.1,\n" +
                "                    \"dew\": 61.2,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 92.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.7,\n" +
                "                    \"visibility\": 11.2,\n" +
                "                    \"cloudcover\": 84.1,\n" +
                "                    \"solarradiation\": 33.0,\n" +
                "                    \"solarenergy\": 0.1,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644850800,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 95.05,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 95.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 78.6,\n" +
                "                    \"solarradiation\": 49.0,\n" +
                "                    \"solarenergy\": 0.2,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644854400,\n" +
                "                    \"temp\": 66.7,\n" +
                "                    \"feelslike\": 66.7,\n" +
                "                    \"humidity\": 85.7,\n" +
                "                    \"dew\": 61.8,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 95.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.4,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 12.9,\n" +
                "                    \"cloudcover\": 81.0,\n" +
                "                    \"solarradiation\": 150.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644858000,\n" +
                "                    \"temp\": 70.4,\n" +
                "                    \"feelslike\": 70.4,\n" +
                "                    \"humidity\": 76.3,\n" +
                "                    \"dew\": 62.1,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 95.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.5,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 10.7,\n" +
                "                    \"cloudcover\": 83.3,\n" +
                "                    \"solarradiation\": 251.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644861600,\n" +
                "                    \"temp\": 74.2,\n" +
                "                    \"feelslike\": 74.2,\n" +
                "                    \"humidity\": 66.91,\n" +
                "                    \"dew\": 62.5,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 95.2,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 8.6,\n" +
                "                    \"cloudcover\": 85.7,\n" +
                "                    \"solarradiation\": 352.0,\n" +
                "                    \"solarenergy\": 1.3,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644865200,\n" +
                "                    \"temp\": 73.5,\n" +
                "                    \"feelslike\": 73.5,\n" +
                "                    \"humidity\": 68.4,\n" +
                "                    \"dew\": 62.4,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 8.5,\n" +
                "                    \"cloudcover\": 86.4,\n" +
                "                    \"solarradiation\": 466.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644868800,\n" +
                "                    \"temp\": 72.8,\n" +
                "                    \"feelslike\": 72.8,\n" +
                "                    \"humidity\": 70.0,\n" +
                "                    \"dew\": 62.4,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 98.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 8.4,\n" +
                "                    \"cloudcover\": 87.0,\n" +
                "                    \"solarradiation\": 580.0,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644872400,\n" +
                "                    \"temp\": 72.1,\n" +
                "                    \"feelslike\": 72.1,\n" +
                "                    \"humidity\": 71.5,\n" +
                "                    \"dew\": 62.3,\n" +
                "                    \"precip\": 0.11,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 8.3,\n" +
                "                    \"cloudcover\": 87.7,\n" +
                "                    \"solarradiation\": 694.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644876000,\n" +
                "                    \"temp\": 68.8,\n" +
                "                    \"feelslike\": 68.8,\n" +
                "                    \"humidity\": 78.4,\n" +
                "                    \"dew\": 61.5,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.3,\n" +
                "                    \"visibility\": 6.7,\n" +
                "                    \"cloudcover\": 91.8,\n" +
                "                    \"solarradiation\": 596.7,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644879600,\n" +
                "                    \"temp\": 65.6,\n" +
                "                    \"feelslike\": 65.6,\n" +
                "                    \"humidity\": 85.2,\n" +
                "                    \"dew\": 60.8,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 5.0,\n" +
                "                    \"cloudcover\": 95.9,\n" +
                "                    \"solarradiation\": 499.3,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644883200,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 92.05,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.14,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 3.4,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 402.0,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644886800,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 92.8,\n" +
                "                    \"dew\": 59.7,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 5.1,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 268.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644890400,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 93.6,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.5,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 6.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 134.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644894000,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 94.4,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 8.6,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644897600,\n" +
                "                    \"temp\": 60.3,\n" +
                "                    \"feelslike\": 60.3,\n" +
                "                    \"humidity\": 95.0,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.7,\n" +
                "                    \"visibility\": 10.7,\n" +
                "                    \"cloudcover\": 99.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-15\",\n" +
                "            \"datetimeEpoch\": 1644901200,\n" +
                "            \"tempmax\": 78.7,\n" +
                "            \"tempmin\": 58.2,\n" +
                "            \"temp\": 66.1,\n" +
                "            \"feelslikemax\": 78.7,\n" +
                "            \"feelslikemin\": 58.2,\n" +
                "            \"feelslike\": 66.1,\n" +
                "            \"dew\": 59.2,\n" +
                "            \"humidity\": 80.7,\n" +
                "            \"precip\": 0.05,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": null,\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.1,\n" +
                "            \"windspeed\": 3.4,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1012.3,\n" +
                "            \"cloudcover\": 77.2,\n" +
                "            \"visibility\": 14.8,\n" +
                "            \"solarradiation\": 258.8,\n" +
                "            \"solarenergy\": 7.4,\n" +
                "            \"uvindex\": 6.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:18:37\",\n" +
                "            \"sunriseEpoch\": 1644923917,\n" +
                "            \"sunset\": \"18:14:21\",\n" +
                "            \"sunsetEpoch\": 1644966861,\n" +
                "            \"moonphase\": 0.49,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644901200,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 95.6,\n" +
                "                    \"dew\": 58.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 12.9,\n" +
                "                    \"cloudcover\": 99.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644904800,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 96.22,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644908400,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 96.4,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 71.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644912000,\n" +
                "                    \"temp\": 58.7,\n" +
                "                    \"feelslike\": 58.7,\n" +
                "                    \"humidity\": 96.6,\n" +
                "                    \"dew\": 57.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 61.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 71.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644915600,\n" +
                "                    \"temp\": 58.2,\n" +
                "                    \"feelslike\": 58.2,\n" +
                "                    \"humidity\": 96.82,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 56.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644919200,\n" +
                "                    \"temp\": 58.4,\n" +
                "                    \"feelslike\": 58.4,\n" +
                "                    \"humidity\": 96.4,\n" +
                "                    \"dew\": 57.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 71.1,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644922800,\n" +
                "                    \"temp\": 58.7,\n" +
                "                    \"feelslike\": 58.7,\n" +
                "                    \"humidity\": 96.0,\n" +
                "                    \"dew\": 57.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.6,\n" +
                "                    \"solarradiation\": 2.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644926400,\n" +
                "                    \"temp\": 58.9,\n" +
                "                    \"feelslike\": 58.9,\n" +
                "                    \"humidity\": 95.58,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 52.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 4.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644930000,\n" +
                "                    \"temp\": 62.6,\n" +
                "                    \"feelslike\": 62.6,\n" +
                "                    \"humidity\": 87.6,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 65.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 139.7,\n" +
                "                    \"solarenergy\": 0.5,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644933600,\n" +
                "                    \"temp\": 66.4,\n" +
                "                    \"feelslike\": 66.4,\n" +
                "                    \"humidity\": 79.7,\n" +
                "                    \"dew\": 59.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 77.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 275.3,\n" +
                "                    \"solarenergy\": 1.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644937200,\n" +
                "                    \"temp\": 70.1,\n" +
                "                    \"feelslike\": 70.1,\n" +
                "                    \"humidity\": 71.75,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 411.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644940800,\n" +
                "                    \"temp\": 73.0,\n" +
                "                    \"feelslike\": 73.0,\n" +
                "                    \"humidity\": 64.6,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 73.0,\n" +
                "                    \"solarradiation\": 488.3,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644944400,\n" +
                "                    \"temp\": 75.8,\n" +
                "                    \"feelslike\": 75.8,\n" +
                "                    \"humidity\": 57.5,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.8,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 46.0,\n" +
                "                    \"solarradiation\": 565.7,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644948000,\n" +
                "                    \"temp\": 78.7,\n" +
                "                    \"feelslike\": 78.7,\n" +
                "                    \"humidity\": 50.39,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 3.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 19.0,\n" +
                "                    \"solarradiation\": 643.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644951600,\n" +
                "                    \"temp\": 77.9,\n" +
                "                    \"feelslike\": 77.9,\n" +
                "                    \"humidity\": 53.1,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 34.4,\n" +
                "                    \"solarradiation\": 645.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644955200,\n" +
                "                    \"temp\": 77.0,\n" +
                "                    \"feelslike\": 77.0,\n" +
                "                    \"humidity\": 55.7,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 49.8,\n" +
                "                    \"solarradiation\": 647.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644958800,\n" +
                "                    \"temp\": 76.2,\n" +
                "                    \"feelslike\": 76.2,\n" +
                "                    \"humidity\": 58.39,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 14.2,\n" +
                "                    \"cloudcover\": 65.2,\n" +
                "                    \"solarradiation\": 649.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644962400,\n" +
                "                    \"temp\": 72.5,\n" +
                "                    \"feelslike\": 72.5,\n" +
                "                    \"humidity\": 67.4,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 14.2,\n" +
                "                    \"cloudcover\": 72.7,\n" +
                "                    \"solarradiation\": 553.7,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644966000,\n" +
                "                    \"temp\": 68.7,\n" +
                "                    \"feelslike\": 68.7,\n" +
                "                    \"humidity\": 76.4,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 80.2,\n" +
                "                    \"solarradiation\": 458.3,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644969600,\n" +
                "                    \"temp\": 65.0,\n" +
                "                    \"feelslike\": 65.0,\n" +
                "                    \"humidity\": 85.36,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 87.7,\n" +
                "                    \"solarradiation\": 363.0,\n" +
                "                    \"solarenergy\": 1.3,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644973200,\n" +
                "                    \"temp\": 64.1,\n" +
                "                    \"feelslike\": 64.1,\n" +
                "                    \"humidity\": 87.2,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 88.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.8,\n" +
                "                    \"windspeed\": 3.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 88.3,\n" +
                "                    \"solarradiation\": 242.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644976800,\n" +
                "                    \"temp\": 63.2,\n" +
                "                    \"feelslike\": 63.2,\n" +
                "                    \"humidity\": 89.0,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 77.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.0,\n" +
                "                    \"windspeed\": 3.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 88.9,\n" +
                "                    \"solarradiation\": 121.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644980400,\n" +
                "                    \"temp\": 62.3,\n" +
                "                    \"feelslike\": 62.3,\n" +
                "                    \"humidity\": 90.88,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 89.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644984000,\n" +
                "                    \"temp\": 61.7,\n" +
                "                    \"feelslike\": 61.7,\n" +
                "                    \"humidity\": 91.9,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.0,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 93.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-16\",\n" +
                "            \"datetimeEpoch\": 1644987600,\n" +
                "            \"tempmax\": 80.7,\n" +
                "            \"tempmin\": 58.7,\n" +
                "            \"temp\": 67.9,\n" +
                "            \"feelslikemax\": 80.9,\n" +
                "            \"feelslikemin\": 58.7,\n" +
                "            \"feelslike\": 67.9,\n" +
                "            \"dew\": 58.0,\n" +
                "            \"humidity\": 74.3,\n" +
                "            \"precip\": 0.01,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": null,\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 4.7,\n" +
                "            \"windspeed\": 4.7,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.0,\n" +
                "            \"cloudcover\": 71.6,\n" +
                "            \"visibility\": 15.0,\n" +
                "            \"solarradiation\": 283.5,\n" +
                "            \"solarenergy\": 8.1,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:18:24\",\n" +
                "            \"sunriseEpoch\": 1645010304,\n" +
                "            \"sunset\": \"18:14:26\",\n" +
                "            \"sunsetEpoch\": 1645053266,\n" +
                "            \"moonphase\": 0.5,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644987600,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 92.8,\n" +
                "                    \"dew\": 59.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.8,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 96.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644991200,\n" +
                "                    \"temp\": 60.5,\n" +
                "                    \"feelslike\": 60.5,\n" +
                "                    \"humidity\": 93.79,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644994800,\n" +
                "                    \"temp\": 59.9,\n" +
                "                    \"feelslike\": 59.9,\n" +
                "                    \"humidity\": 94.2,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 46.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 93.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1644998400,\n" +
                "                    \"temp\": 59.3,\n" +
                "                    \"feelslike\": 59.3,\n" +
                "                    \"humidity\": 94.6,\n" +
                "                    \"dew\": 57.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 25.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 87.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645002000,\n" +
                "                    \"temp\": 58.7,\n" +
                "                    \"feelslike\": 58.7,\n" +
                "                    \"humidity\": 94.96,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 4.8,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 81.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645005600,\n" +
                "                    \"temp\": 58.8,\n" +
                "                    \"feelslike\": 58.8,\n" +
                "                    \"humidity\": 94.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 4.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 82.4,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645009200,\n" +
                "                    \"temp\": 59.0,\n" +
                "                    \"feelslike\": 59.0,\n" +
                "                    \"humidity\": 92.9,\n" +
                "                    \"dew\": 56.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 4.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 83.0,\n" +
                "                    \"solarradiation\": 2.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645012800,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 91.94,\n" +
                "                    \"dew\": 56.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 4.8,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 83.6,\n" +
                "                    \"solarradiation\": 4.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645016400,\n" +
                "                    \"temp\": 63.8,\n" +
                "                    \"feelslike\": 63.8,\n" +
                "                    \"humidity\": 81.3,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 19.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.6,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.8,\n" +
                "                    \"solarradiation\": 152.3,\n" +
                "                    \"solarenergy\": 0.5,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645020000,\n" +
                "                    \"temp\": 68.4,\n" +
                "                    \"feelslike\": 68.4,\n" +
                "                    \"humidity\": 70.6,\n" +
                "                    \"dew\": 57.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 33.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.6,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 93.9,\n" +
                "                    \"solarradiation\": 300.7,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645023600,\n" +
                "                    \"temp\": 73.1,\n" +
                "                    \"feelslike\": 73.1,\n" +
                "                    \"humidity\": 59.89,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.1,\n" +
                "                    \"solarradiation\": 449.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645027200,\n" +
                "                    \"temp\": 75.6,\n" +
                "                    \"feelslike\": 75.7,\n" +
                "                    \"humidity\": 54.8,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 74.0,\n" +
                "                    \"solarradiation\": 532.7,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645030800,\n" +
                "                    \"temp\": 78.2,\n" +
                "                    \"feelslike\": 78.3,\n" +
                "                    \"humidity\": 49.7,\n" +
                "                    \"dew\": 57.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 3.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 49.0,\n" +
                "                    \"solarradiation\": 616.3,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645034400,\n" +
                "                    \"temp\": 80.7,\n" +
                "                    \"feelslike\": 80.9,\n" +
                "                    \"humidity\": 44.55,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.7,\n" +
                "                    \"windspeed\": 4.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 23.9,\n" +
                "                    \"solarradiation\": 700.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645038000,\n" +
                "                    \"temp\": 80.7,\n" +
                "                    \"feelslike\": 80.9,\n" +
                "                    \"humidity\": 44.8,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 65.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.2,\n" +
                "                    \"windspeed\": 3.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 35.3,\n" +
                "                    \"solarradiation\": 700.7,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645041600,\n" +
                "                    \"temp\": 80.7,\n" +
                "                    \"feelslike\": 80.9,\n" +
                "                    \"humidity\": 45.1,\n" +
                "                    \"dew\": 57.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 82.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 46.8,\n" +
                "                    \"solarradiation\": 701.3,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645045200,\n" +
                "                    \"temp\": 80.7,\n" +
                "                    \"feelslike\": 80.9,\n" +
                "                    \"humidity\": 45.43,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1005.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 58.2,\n" +
                "                    \"solarradiation\": 702.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645048800,\n" +
                "                    \"temp\": 76.6,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 54.8,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1006.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 66.4,\n" +
                "                    \"solarradiation\": 605.7,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645052400,\n" +
                "                    \"temp\": 72.4,\n" +
                "                    \"feelslike\": 72.5,\n" +
                "                    \"humidity\": 64.1,\n" +
                "                    \"dew\": 58.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.2,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 74.5,\n" +
                "                    \"solarradiation\": 509.3,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645056000,\n" +
                "                    \"temp\": 68.3,\n" +
                "                    \"feelslike\": 68.3,\n" +
                "                    \"humidity\": 73.44,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.7,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 82.7,\n" +
                "                    \"solarradiation\": 413.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645059600,\n" +
                "                    \"temp\": 66.1,\n" +
                "                    \"feelslike\": 66.1,\n" +
                "                    \"humidity\": 79.1,\n" +
                "                    \"dew\": 59.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.4,\n" +
                "                    \"windspeed\": 3.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 69.7,\n" +
                "                    \"solarradiation\": 275.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645063200,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 84.7,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.1,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 56.7,\n" +
                "                    \"solarradiation\": 137.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645066800,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 90.27,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.8,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 43.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 3.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645070400,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 90.4,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 62.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-17\",\n" +
                "            \"datetimeEpoch\": 1645074000,\n" +
                "            \"tempmax\": 82.1,\n" +
                "            \"tempmin\": 58.7,\n" +
                "            \"temp\": 68.6,\n" +
                "            \"feelslikemax\": 81.5,\n" +
                "            \"feelslikemin\": 58.7,\n" +
                "            \"feelslike\": 68.5,\n" +
                "            \"dew\": 56.5,\n" +
                "            \"humidity\": 68.8,\n" +
                "            \"precip\": 0.0,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": null,\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 5.8,\n" +
                "            \"windspeed\": 4.0,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1010.8,\n" +
                "            \"cloudcover\": 77.0,\n" +
                "            \"visibility\": 15.0,\n" +
                "            \"solarradiation\": 305.6,\n" +
                "            \"solarenergy\": 8.8,\n" +
                "            \"uvindex\": 8.0,\n" +
                "            \"severerisk\": 10.0,\n" +
                "            \"sunrise\": \"06:18:10\",\n" +
                "            \"sunriseEpoch\": 1645096690,\n" +
                "            \"sunset\": \"18:14:31\",\n" +
                "            \"sunsetEpoch\": 1645139671,\n" +
                "            \"moonphase\": 0.51,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Becoming cloudy in the afternoon with rain.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645074000,\n" +
                "                    \"temp\": 60.6,\n" +
                "                    \"feelslike\": 60.6,\n" +
                "                    \"humidity\": 90.6,\n" +
                "                    \"dew\": 57.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 81.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645077600,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 90.79,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645081200,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 91.0,\n" +
                "                    \"dew\": 56.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 65.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645084800,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 91.2,\n" +
                "                    \"dew\": 56.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 49.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645088400,\n" +
                "                    \"temp\": 58.7,\n" +
                "                    \"feelslike\": 58.7,\n" +
                "                    \"humidity\": 91.33,\n" +
                "                    \"dew\": 56.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 33.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645092000,\n" +
                "                    \"temp\": 59.0,\n" +
                "                    \"feelslike\": 59.0,\n" +
                "                    \"humidity\": 90.0,\n" +
                "                    \"dew\": 56.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 33.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 1.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 72.4,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645095600,\n" +
                "                    \"temp\": 59.3,\n" +
                "                    \"feelslike\": 59.3,\n" +
                "                    \"humidity\": 88.6,\n" +
                "                    \"dew\": 55.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 33.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 44.7,\n" +
                "                    \"solarradiation\": 2.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645099200,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 87.3,\n" +
                "                    \"dew\": 55.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 33.3,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 17.1,\n" +
                "                    \"solarradiation\": 4.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Clear\",\n" +
                "                    \"icon\": \"clear-day\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645102800,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 76.6,\n" +
                "                    \"dew\": 56.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 46.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 17.6,\n" +
                "                    \"solarradiation\": 161.3,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645106400,\n" +
                "                    \"temp\": 69.3,\n" +
                "                    \"feelslike\": 69.3,\n" +
                "                    \"humidity\": 65.9,\n" +
                "                    \"dew\": 56.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 58.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 1.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 18.2,\n" +
                "                    \"solarradiation\": 318.7,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645110000,\n" +
                "                    \"temp\": 74.2,\n" +
                "                    \"feelslike\": 74.2,\n" +
                "                    \"humidity\": 55.2,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 71.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 18.7,\n" +
                "                    \"solarradiation\": 476.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 3.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645113600,\n" +
                "                    \"temp\": 76.8,\n" +
                "                    \"feelslike\": 76.6,\n" +
                "                    \"humidity\": 49.9,\n" +
                "                    \"dew\": 56.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 71.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.0,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 45.1,\n" +
                "                    \"solarradiation\": 558.3,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645117200,\n" +
                "                    \"temp\": 79.5,\n" +
                "                    \"feelslike\": 79.1,\n" +
                "                    \"humidity\": 44.6,\n" +
                "                    \"dew\": 55.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 71.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.9,\n" +
                "                    \"windspeed\": 3.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 71.5,\n" +
                "                    \"solarradiation\": 640.7,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645120800,\n" +
                "                    \"temp\": 82.1,\n" +
                "                    \"feelslike\": 81.5,\n" +
                "                    \"humidity\": 39.32,\n" +
                "                    \"dew\": 54.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 71.4,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 5.8,\n" +
                "                    \"windspeed\": 4.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 97.9,\n" +
                "                    \"solarradiation\": 723.0,\n" +
                "                    \"solarenergy\": 2.6,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645124400,\n" +
                "                    \"temp\": 81.8,\n" +
                "                    \"feelslike\": 81.3,\n" +
                "                    \"humidity\": 39.7,\n" +
                "                    \"dew\": 54.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 80.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 4.8,\n" +
                "                    \"windspeed\": 3.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 98.3,\n" +
                "                    \"solarradiation\": 740.3,\n" +
                "                    \"solarenergy\": 2.7,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645128000,\n" +
                "                    \"temp\": 81.5,\n" +
                "                    \"feelslike\": 81.1,\n" +
                "                    \"humidity\": 40.1,\n" +
                "                    \"dew\": 54.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.9,\n" +
                "                    \"windspeed\": 3.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 98.7,\n" +
                "                    \"solarradiation\": 757.7,\n" +
                "                    \"solarenergy\": 2.7,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645131600,\n" +
                "                    \"temp\": 81.2,\n" +
                "                    \"feelslike\": 80.9,\n" +
                "                    \"humidity\": 40.48,\n" +
                "                    \"dew\": 54.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.9,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1005.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 99.1,\n" +
                "                    \"solarradiation\": 775.0,\n" +
                "                    \"solarenergy\": 2.8,\n" +
                "                    \"uvindex\": 8.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645135200,\n" +
                "                    \"temp\": 76.9,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 50.2,\n" +
                "                    \"dew\": 56.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1006.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 93.8,\n" +
                "                    \"solarradiation\": 672.3,\n" +
                "                    \"solarenergy\": 2.4,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645138800,\n" +
                "                    \"temp\": 72.7,\n" +
                "                    \"feelslike\": 72.6,\n" +
                "                    \"humidity\": 60.0,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.5,\n" +
                "                    \"solarradiation\": 569.7,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645142400,\n" +
                "                    \"temp\": 68.4,\n" +
                "                    \"feelslike\": 68.4,\n" +
                "                    \"humidity\": 69.77,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 83.2,\n" +
                "                    \"solarradiation\": 467.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645146000,\n" +
                "                    \"temp\": 67.2,\n" +
                "                    \"feelslike\": 67.2,\n" +
                "                    \"humidity\": 72.0,\n" +
                "                    \"dew\": 57.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.4,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.8,\n" +
                "                    \"solarradiation\": 311.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645149600,\n" +
                "                    \"temp\": 66.0,\n" +
                "                    \"feelslike\": 66.0,\n" +
                "                    \"humidity\": 74.3,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 94.4,\n" +
                "                    \"solarradiation\": 155.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645153200,\n" +
                "                    \"temp\": 64.8,\n" +
                "                    \"feelslike\": 64.8,\n" +
                "                    \"humidity\": 76.5,\n" +
                "                    \"dew\": 57.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.9,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 3.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645156800,\n" +
                "                    \"temp\": 63.5,\n" +
                "                    \"feelslike\": 63.5,\n" +
                "                    \"humidity\": 79.6,\n" +
                "                    \"dew\": 57.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-18\",\n" +
                "            \"datetimeEpoch\": 1645160400,\n" +
                "            \"tempmax\": 81.4,\n" +
                "            \"tempmin\": 59.1,\n" +
                "            \"temp\": 67.5,\n" +
                "            \"feelslikemax\": 81.2,\n" +
                "            \"feelslikemin\": 59.1,\n" +
                "            \"feelslike\": 67.4,\n" +
                "            \"dew\": 57.3,\n" +
                "            \"humidity\": 72.5,\n" +
                "            \"precip\": 0.09,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.6,\n" +
                "            \"windspeed\": 3.8,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.6,\n" +
                "            \"cloudcover\": 82.9,\n" +
                "            \"visibility\": 14.8,\n" +
                "            \"solarradiation\": 232.4,\n" +
                "            \"solarenergy\": 6.7,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:17:56\",\n" +
                "            \"sunriseEpoch\": 1645183076,\n" +
                "            \"sunset\": \"18:14:36\",\n" +
                "            \"sunsetEpoch\": 1645226076,\n" +
                "            \"moonphase\": 0.52,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645160400,\n" +
                "                    \"temp\": 62.2,\n" +
                "                    \"feelslike\": 62.2,\n" +
                "                    \"humidity\": 82.6,\n" +
                "                    \"dew\": 56.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645164000,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 85.68,\n" +
                "                    \"dew\": 56.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645167600,\n" +
                "                    \"temp\": 60.3,\n" +
                "                    \"feelslike\": 60.3,\n" +
                "                    \"humidity\": 86.4,\n" +
                "                    \"dew\": 56.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 82.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645171200,\n" +
                "                    \"temp\": 59.7,\n" +
                "                    \"feelslike\": 59.7,\n" +
                "                    \"humidity\": 87.1,\n" +
                "                    \"dew\": 55.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 74.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645174800,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 87.84,\n" +
                "                    \"dew\": 55.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645178400,\n" +
                "                    \"temp\": 59.4,\n" +
                "                    \"feelslike\": 59.4,\n" +
                "                    \"humidity\": 86.4,\n" +
                "                    \"dew\": 55.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 96.2,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645182000,\n" +
                "                    \"temp\": 59.7,\n" +
                "                    \"feelslike\": 59.7,\n" +
                "                    \"humidity\": 84.9,\n" +
                "                    \"dew\": 55.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 92.3,\n" +
                "                    \"solarradiation\": 2.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645185600,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 83.42,\n" +
                "                    \"dew\": 54.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 88.5,\n" +
                "                    \"solarradiation\": 4.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645189200,\n" +
                "                    \"temp\": 64.7,\n" +
                "                    \"feelslike\": 64.7,\n" +
                "                    \"humidity\": 73.8,\n" +
                "                    \"dew\": 55.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 74.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.5,\n" +
                "                    \"solarradiation\": 156.7,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645192800,\n" +
                "                    \"temp\": 69.3,\n" +
                "                    \"feelslike\": 69.3,\n" +
                "                    \"humidity\": 64.1,\n" +
                "                    \"dew\": 56.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 82.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 82.6,\n" +
                "                    \"solarradiation\": 309.3,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645196400,\n" +
                "                    \"temp\": 74.0,\n" +
                "                    \"feelslike\": 74.0,\n" +
                "                    \"humidity\": 54.46,\n" +
                "                    \"dew\": 56.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 79.6,\n" +
                "                    \"solarradiation\": 462.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 3.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645200000,\n" +
                "                    \"temp\": 76.5,\n" +
                "                    \"feelslike\": 76.4,\n" +
                "                    \"humidity\": 50.3,\n" +
                "                    \"dew\": 56.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 67.8,\n" +
                "                    \"solarradiation\": 533.3,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 5.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645203600,\n" +
                "                    \"temp\": 78.9,\n" +
                "                    \"feelslike\": 78.8,\n" +
                "                    \"humidity\": 46.1,\n" +
                "                    \"dew\": 56.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 56.1,\n" +
                "                    \"solarradiation\": 604.7,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 7.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645207200,\n" +
                "                    \"temp\": 81.4,\n" +
                "                    \"feelslike\": 81.2,\n" +
                "                    \"humidity\": 41.86,\n" +
                "                    \"dew\": 56.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 44.3,\n" +
                "                    \"solarradiation\": 676.0,\n" +
                "                    \"solarenergy\": 2.4,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645210800,\n" +
                "                    \"temp\": 79.2,\n" +
                "                    \"feelslike\": 79.0,\n" +
                "                    \"humidity\": 46.8,\n" +
                "                    \"dew\": 56.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 61.3,\n" +
                "                    \"solarradiation\": 605.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645214400,\n" +
                "                    \"temp\": 76.9,\n" +
                "                    \"feelslike\": 76.9,\n" +
                "                    \"humidity\": 51.8,\n" +
                "                    \"dew\": 57.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 3.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 78.4,\n" +
                "                    \"solarradiation\": 534.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645218000,\n" +
                "                    \"temp\": 74.7,\n" +
                "                    \"feelslike\": 74.7,\n" +
                "                    \"humidity\": 56.72,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 3.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 95.4,\n" +
                "                    \"solarradiation\": 463.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645221600,\n" +
                "                    \"temp\": 72.1,\n" +
                "                    \"feelslike\": 72.1,\n" +
                "                    \"humidity\": 63.9,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 3.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 85.2,\n" +
                "                    \"solarradiation\": 393.3,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645225200,\n" +
                "                    \"temp\": 69.6,\n" +
                "                    \"feelslike\": 69.6,\n" +
                "                    \"humidity\": 71.0,\n" +
                "                    \"dew\": 59.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 74.9,\n" +
                "                    \"solarradiation\": 323.7,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645228800,\n" +
                "                    \"temp\": 67.0,\n" +
                "                    \"feelslike\": 67.0,\n" +
                "                    \"humidity\": 78.18,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 64.7,\n" +
                "                    \"solarradiation\": 254.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645232400,\n" +
                "                    \"temp\": 65.5,\n" +
                "                    \"feelslike\": 65.5,\n" +
                "                    \"humidity\": 82.6,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.3,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 73.3,\n" +
                "                    \"solarradiation\": 169.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645236000,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 87.0,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.8,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 81.8,\n" +
                "                    \"solarradiation\": 84.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645239600,\n" +
                "                    \"temp\": 62.5,\n" +
                "                    \"feelslike\": 62.5,\n" +
                "                    \"humidity\": 91.47,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.05,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.1,\n" +
                "                    \"cloudcover\": 90.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645243200,\n" +
                "                    \"temp\": 61.7,\n" +
                "                    \"feelslike\": 61.7,\n" +
                "                    \"humidity\": 92.6,\n" +
                "                    \"dew\": 59.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 65.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-19\",\n" +
                "            \"datetimeEpoch\": 1645246800,\n" +
                "            \"tempmax\": 80.0,\n" +
                "            \"tempmin\": 59.4,\n" +
                "            \"temp\": 67.3,\n" +
                "            \"feelslikemax\": 80.0,\n" +
                "            \"feelslikemin\": 59.4,\n" +
                "            \"feelslike\": 67.3,\n" +
                "            \"dew\": 59.1,\n" +
                "            \"humidity\": 78.1,\n" +
                "            \"precip\": 0.17,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": null,\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.1,\n" +
                "            \"windspeed\": 2.7,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1012.0,\n" +
                "            \"cloudcover\": 45.5,\n" +
                "            \"visibility\": 14.4,\n" +
                "            \"solarradiation\": 250.3,\n" +
                "            \"solarenergy\": 7.1,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:17:40\",\n" +
                "            \"sunriseEpoch\": 1645269460,\n" +
                "            \"sunset\": \"18:14:40\",\n" +
                "            \"sunsetEpoch\": 1645312480,\n" +
                "            \"moonphase\": 0.54,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645246800,\n" +
                "                    \"temp\": 60.8,\n" +
                "                    \"feelslike\": 60.8,\n" +
                "                    \"humidity\": 93.8,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 40.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645250400,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 94.99,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 16.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645254000,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 95.0,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 69.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 44.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645257600,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 95.0,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 58.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 72.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645261200,\n" +
                "                    \"temp\": 59.4,\n" +
                "                    \"feelslike\": 59.4,\n" +
                "                    \"humidity\": 94.98,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645264800,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 94.8,\n" +
                "                    \"dew\": 58.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 76.9,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645268400,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 94.6,\n" +
                "                    \"dew\": 58.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 53.8,\n" +
                "                    \"solarradiation\": 2.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645272000,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 94.38,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 30.7,\n" +
                "                    \"solarradiation\": 4.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645275600,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 83.6,\n" +
                "                    \"dew\": 58.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 61.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 29.8,\n" +
                "                    \"solarradiation\": 162.0,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645279200,\n" +
                "                    \"temp\": 69.0,\n" +
                "                    \"feelslike\": 69.0,\n" +
                "                    \"humidity\": 72.7,\n" +
                "                    \"dew\": 59.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 28.8,\n" +
                "                    \"solarradiation\": 320.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645282800,\n" +
                "                    \"temp\": 73.5,\n" +
                "                    \"feelslike\": 73.5,\n" +
                "                    \"humidity\": 61.9,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 27.9,\n" +
                "                    \"solarradiation\": 478.0,\n" +
                "                    \"solarenergy\": 1.7,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645286400,\n" +
                "                    \"temp\": 75.7,\n" +
                "                    \"feelslike\": 75.7,\n" +
                "                    \"humidity\": 57.1,\n" +
                "                    \"dew\": 59.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 35.5,\n" +
                "                    \"solarradiation\": 545.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645290000,\n" +
                "                    \"temp\": 77.8,\n" +
                "                    \"feelslike\": 77.8,\n" +
                "                    \"humidity\": 52.2,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.8,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 43.0,\n" +
                "                    \"solarradiation\": 612.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645293600,\n" +
                "                    \"temp\": 80.0,\n" +
                "                    \"feelslike\": 80.0,\n" +
                "                    \"humidity\": 47.42,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 50.6,\n" +
                "                    \"solarradiation\": 679.0,\n" +
                "                    \"solarenergy\": 2.4,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645297200,\n" +
                "                    \"temp\": 79.1,\n" +
                "                    \"feelslike\": 79.1,\n" +
                "                    \"humidity\": 49.6,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 54.2,\n" +
                "                    \"solarradiation\": 630.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645300800,\n" +
                "                    \"temp\": 78.3,\n" +
                "                    \"feelslike\": 78.3,\n" +
                "                    \"humidity\": 51.7,\n" +
                "                    \"dew\": 59.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 57.9,\n" +
                "                    \"solarradiation\": 581.0,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645304400,\n" +
                "                    \"temp\": 77.4,\n" +
                "                    \"feelslike\": 77.4,\n" +
                "                    \"humidity\": 53.89,\n" +
                "                    \"dew\": 59.4,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 61.5,\n" +
                "                    \"solarradiation\": 532.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645308000,\n" +
                "                    \"temp\": 73.5,\n" +
                "                    \"feelslike\": 73.5,\n" +
                "                    \"humidity\": 64.4,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 13.3,\n" +
                "                    \"cloudcover\": 60.5,\n" +
                "                    \"solarradiation\": 457.7,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645311600,\n" +
                "                    \"temp\": 69.5,\n" +
                "                    \"feelslike\": 69.5,\n" +
                "                    \"humidity\": 74.9,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.3,\n" +
                "                    \"visibility\": 11.6,\n" +
                "                    \"cloudcover\": 59.6,\n" +
                "                    \"solarradiation\": 383.3,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645315200,\n" +
                "                    \"temp\": 65.6,\n" +
                "                    \"feelslike\": 65.6,\n" +
                "                    \"humidity\": 85.39,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 9.9,\n" +
                "                    \"cloudcover\": 58.6,\n" +
                "                    \"solarradiation\": 309.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645318800,\n" +
                "                    \"temp\": 64.4,\n" +
                "                    \"feelslike\": 64.4,\n" +
                "                    \"humidity\": 87.6,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 11.6,\n" +
                "                    \"cloudcover\": 45.2,\n" +
                "                    \"solarradiation\": 206.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645322400,\n" +
                "                    \"temp\": 63.3,\n" +
                "                    \"feelslike\": 63.3,\n" +
                "                    \"humidity\": 89.8,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 13.3,\n" +
                "                    \"cloudcover\": 31.7,\n" +
                "                    \"solarradiation\": 103.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645326000,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 92.04,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 18.3,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645329600,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 93.0,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 28.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-20\",\n" +
                "            \"datetimeEpoch\": 1645333200,\n" +
                "            \"tempmax\": 79.6,\n" +
                "            \"tempmin\": 60.3,\n" +
                "            \"temp\": 66.9,\n" +
                "            \"feelslikemax\": 79.6,\n" +
                "            \"feelslikemin\": 60.3,\n" +
                "            \"feelslike\": 66.9,\n" +
                "            \"dew\": 59.5,\n" +
                "            \"humidity\": 80.0,\n" +
                "            \"precip\": 0.17,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 2.7,\n" +
                "            \"windspeed\": 2.9,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1012.4,\n" +
                "            \"cloudcover\": 52.5,\n" +
                "            \"visibility\": 14.0,\n" +
                "            \"solarradiation\": 253.4,\n" +
                "            \"solarenergy\": 7.2,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 10.0,\n" +
                "            \"sunrise\": \"06:17:25\",\n" +
                "            \"sunriseEpoch\": 1645355845,\n" +
                "            \"sunset\": \"18:14:43\",\n" +
                "            \"sunsetEpoch\": 1645398883,\n" +
                "            \"moonphase\": 0.58,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with a chance of rain throughout the day.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645333200,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 94.0,\n" +
                "                    \"dew\": 59.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.6,\n" +
                "                    \"cloudcover\": 38.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645336800,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 95.0,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 49.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645340400,\n" +
                "                    \"temp\": 60.6,\n" +
                "                    \"feelslike\": 60.6,\n" +
                "                    \"humidity\": 95.4,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 68.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 13.4,\n" +
                "                    \"cloudcover\": 52.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645344000,\n" +
                "                    \"temp\": 60.4,\n" +
                "                    \"feelslike\": 60.4,\n" +
                "                    \"humidity\": 95.8,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 55.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 12.5,\n" +
                "                    \"cloudcover\": 55.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645347600,\n" +
                "                    \"temp\": 60.3,\n" +
                "                    \"feelslike\": 60.3,\n" +
                "                    \"humidity\": 96.23,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 42.9,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 11.5,\n" +
                "                    \"cloudcover\": 58.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645351200,\n" +
                "                    \"temp\": 60.5,\n" +
                "                    \"feelslike\": 60.5,\n" +
                "                    \"humidity\": 96.2,\n" +
                "                    \"dew\": 59.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 42.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 12.0,\n" +
                "                    \"cloudcover\": 57.6,\n" +
                "                    \"solarradiation\": 0.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645354800,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 96.2,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 42.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.3,\n" +
                "                    \"visibility\": 12.5,\n" +
                "                    \"cloudcover\": 56.5,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-night\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645358400,\n" +
                "                    \"temp\": 60.9,\n" +
                "                    \"feelslike\": 60.9,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 42.9,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 13.0,\n" +
                "                    \"cloudcover\": 55.4,\n" +
                "                    \"solarradiation\": 2.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Partially cloudy\",\n" +
                "                    \"icon\": \"partly-cloudy-day\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645362000,\n" +
                "                    \"temp\": 63.4,\n" +
                "                    \"feelslike\": 63.4,\n" +
                "                    \"humidity\": 90.8,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 55.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 44.2,\n" +
                "                    \"solarradiation\": 94.0,\n" +
                "                    \"solarenergy\": 0.3,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645365600,\n" +
                "                    \"temp\": 65.8,\n" +
                "                    \"feelslike\": 65.8,\n" +
                "                    \"humidity\": 85.3,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 68.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 33.1,\n" +
                "                    \"solarradiation\": 186.0,\n" +
                "                    \"solarenergy\": 0.7,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645369200,\n" +
                "                    \"temp\": 68.3,\n" +
                "                    \"feelslike\": 68.3,\n" +
                "                    \"humidity\": 79.79,\n" +
                "                    \"dew\": 61.8,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1015.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 21.9,\n" +
                "                    \"solarradiation\": 278.0,\n" +
                "                    \"solarenergy\": 1.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645372800,\n" +
                "                    \"temp\": 72.1,\n" +
                "                    \"feelslike\": 72.1,\n" +
                "                    \"humidity\": 69.1,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 17.2,\n" +
                "                    \"solarradiation\": 393.0,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645376400,\n" +
                "                    \"temp\": 75.8,\n" +
                "                    \"feelslike\": 75.8,\n" +
                "                    \"humidity\": 58.4,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 12.6,\n" +
                "                    \"solarradiation\": 508.0,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645380000,\n" +
                "                    \"temp\": 79.6,\n" +
                "                    \"feelslike\": 79.6,\n" +
                "                    \"humidity\": 47.67,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 7.9,\n" +
                "                    \"solarradiation\": 623.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645383600,\n" +
                "                    \"temp\": 78.9,\n" +
                "                    \"feelslike\": 78.9,\n" +
                "                    \"humidity\": 49.0,\n" +
                "                    \"dew\": 58.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 32.7,\n" +
                "                    \"solarradiation\": 660.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645387200,\n" +
                "                    \"temp\": 78.1,\n" +
                "                    \"feelslike\": 78.1,\n" +
                "                    \"humidity\": 50.2,\n" +
                "                    \"dew\": 58.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 57.6,\n" +
                "                    \"solarradiation\": 697.0,\n" +
                "                    \"solarenergy\": 2.5,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645390800,\n" +
                "                    \"temp\": 77.4,\n" +
                "                    \"feelslike\": 77.4,\n" +
                "                    \"humidity\": 51.52,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 82.4,\n" +
                "                    \"solarradiation\": 734.0,\n" +
                "                    \"solarenergy\": 2.6,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645394400,\n" +
                "                    \"temp\": 73.6,\n" +
                "                    \"feelslike\": 73.6,\n" +
                "                    \"humidity\": 61.8,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.3,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 83.4,\n" +
                "                    \"solarradiation\": 619.3,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645398000,\n" +
                "                    \"temp\": 69.7,\n" +
                "                    \"feelslike\": 69.7,\n" +
                "                    \"humidity\": 72.0,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 1.9,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.7,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 84.4,\n" +
                "                    \"solarradiation\": 504.7,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645401600,\n" +
                "                    \"temp\": 65.9,\n" +
                "                    \"feelslike\": 65.9,\n" +
                "                    \"humidity\": 82.21,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.07,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 85.4,\n" +
                "                    \"solarradiation\": 390.0,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645405200,\n" +
                "                    \"temp\": 64.6,\n" +
                "                    \"feelslike\": 64.6,\n" +
                "                    \"humidity\": 85.3,\n" +
                "                    \"dew\": 60.1,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.1,\n" +
                "                    \"cloudcover\": 76.6,\n" +
                "                    \"solarradiation\": 260.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645408800,\n" +
                "                    \"temp\": 63.4,\n" +
                "                    \"feelslike\": 63.4,\n" +
                "                    \"humidity\": 88.4,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 67.7,\n" +
                "                    \"solarradiation\": 130.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645412400,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 91.45,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 58.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645416000,\n" +
                "                    \"temp\": 61.3,\n" +
                "                    \"feelslike\": 61.3,\n" +
                "                    \"humidity\": 92.8,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.6,\n" +
                "                    \"cloudcover\": 50.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-21\",\n" +
                "            \"datetimeEpoch\": 1645419600,\n" +
                "            \"tempmax\": 79.6,\n" +
                "            \"tempmin\": 59.1,\n" +
                "            \"temp\": 65.6,\n" +
                "            \"feelslikemax\": 79.6,\n" +
                "            \"feelslikemin\": 59.1,\n" +
                "            \"feelslike\": 65.6,\n" +
                "            \"dew\": 59.4,\n" +
                "            \"humidity\": 82.5,\n" +
                "            \"precip\": 0.17,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": null,\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.1,\n" +
                "            \"windspeed\": 3.1,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1012.0,\n" +
                "            \"cloudcover\": 64.7,\n" +
                "            \"visibility\": 14.6,\n" +
                "            \"solarradiation\": 207.0,\n" +
                "            \"solarenergy\": 6.0,\n" +
                "            \"uvindex\": 6.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:17:08\",\n" +
                "            \"sunriseEpoch\": 1645442228,\n" +
                "            \"sunset\": \"18:14:45\",\n" +
                "            \"sunsetEpoch\": 1645485285,\n" +
                "            \"moonphase\": 0.62,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645419600,\n" +
                "                    \"temp\": 60.6,\n" +
                "                    \"feelslike\": 60.6,\n" +
                "                    \"humidity\": 94.2,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 42.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645423200,\n" +
                "                    \"temp\": 59.8,\n" +
                "                    \"feelslike\": 59.8,\n" +
                "                    \"humidity\": 95.6,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 33.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645426800,\n" +
                "                    \"temp\": 59.6,\n" +
                "                    \"feelslike\": 59.6,\n" +
                "                    \"humidity\": 96.2,\n" +
                "                    \"dew\": 58.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 52.4,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645430400,\n" +
                "                    \"temp\": 59.3,\n" +
                "                    \"feelslike\": 59.3,\n" +
                "                    \"humidity\": 96.8,\n" +
                "                    \"dew\": 58.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 61.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.4,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 71.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645434000,\n" +
                "                    \"temp\": 59.1,\n" +
                "                    \"feelslike\": 59.1,\n" +
                "                    \"humidity\": 97.46,\n" +
                "                    \"dew\": 58.4,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.2,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 89.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645437600,\n" +
                "                    \"temp\": 59.4,\n" +
                "                    \"feelslike\": 59.4,\n" +
                "                    \"humidity\": 97.0,\n" +
                "                    \"dew\": 58.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.3,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 85.3,\n" +
                "                    \"solarradiation\": 1.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645441200,\n" +
                "                    \"temp\": 59.7,\n" +
                "                    \"feelslike\": 59.7,\n" +
                "                    \"humidity\": 96.6,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.3,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.7,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 80.7,\n" +
                "                    \"solarradiation\": 2.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645444800,\n" +
                "                    \"temp\": 60.0,\n" +
                "                    \"feelslike\": 60.0,\n" +
                "                    \"humidity\": 96.22,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 47.6,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.4,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.1,\n" +
                "                    \"cloudcover\": 76.1,\n" +
                "                    \"solarradiation\": 3.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645448400,\n" +
                "                    \"temp\": 62.6,\n" +
                "                    \"feelslike\": 62.6,\n" +
                "                    \"humidity\": 89.4,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 58.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.6,\n" +
                "                    \"windspeed\": 0.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 69.7,\n" +
                "                    \"solarradiation\": 83.7,\n" +
                "                    \"solarenergy\": 0.3,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645452000,\n" +
                "                    \"temp\": 65.3,\n" +
                "                    \"feelslike\": 65.3,\n" +
                "                    \"humidity\": 82.6,\n" +
                "                    \"dew\": 59.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 69.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 63.2,\n" +
                "                    \"solarradiation\": 164.3,\n" +
                "                    \"solarenergy\": 0.6,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645455600,\n" +
                "                    \"temp\": 67.9,\n" +
                "                    \"feelslike\": 67.9,\n" +
                "                    \"humidity\": 75.79,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 56.8,\n" +
                "                    \"solarradiation\": 245.0,\n" +
                "                    \"solarenergy\": 0.9,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645459200,\n" +
                "                    \"temp\": 71.8,\n" +
                "                    \"feelslike\": 71.8,\n" +
                "                    \"humidity\": 66.4,\n" +
                "                    \"dew\": 59.3,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 41.1,\n" +
                "                    \"solarradiation\": 335.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645462800,\n" +
                "                    \"temp\": 75.7,\n" +
                "                    \"feelslike\": 75.7,\n" +
                "                    \"humidity\": 57.0,\n" +
                "                    \"dew\": 58.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 25.4,\n" +
                "                    \"solarradiation\": 425.0,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645466400,\n" +
                "                    \"temp\": 79.6,\n" +
                "                    \"feelslike\": 79.6,\n" +
                "                    \"humidity\": 47.67,\n" +
                "                    \"dew\": 58.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 3.1,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 9.7,\n" +
                "                    \"solarradiation\": 515.0,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645470000,\n" +
                "                    \"temp\": 77.1,\n" +
                "                    \"feelslike\": 77.1,\n" +
                "                    \"humidity\": 54.4,\n" +
                "                    \"dew\": 59.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.3,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 36.6,\n" +
                "                    \"solarradiation\": 537.0,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645473600,\n" +
                "                    \"temp\": 74.6,\n" +
                "                    \"feelslike\": 74.6,\n" +
                "                    \"humidity\": 61.2,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 14.6,\n" +
                "                    \"cloudcover\": 63.6,\n" +
                "                    \"solarradiation\": 559.0,\n" +
                "                    \"solarenergy\": 2.0,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645477200,\n" +
                "                    \"temp\": 72.1,\n" +
                "                    \"feelslike\": 72.1,\n" +
                "                    \"humidity\": 67.95,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 90.5,\n" +
                "                    \"solarradiation\": 581.0,\n" +
                "                    \"solarenergy\": 2.1,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645480800,\n" +
                "                    \"temp\": 69.6,\n" +
                "                    \"feelslike\": 69.6,\n" +
                "                    \"humidity\": 74.1,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.9,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.3,\n" +
                "                    \"visibility\": 14.6,\n" +
                "                    \"cloudcover\": 80.6,\n" +
                "                    \"solarradiation\": 491.3,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645484400,\n" +
                "                    \"temp\": 67.0,\n" +
                "                    \"feelslike\": 67.0,\n" +
                "                    \"humidity\": 80.3,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.7,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 70.6,\n" +
                "                    \"solarradiation\": 401.7,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645488000,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 86.43,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 60.7,\n" +
                "                    \"solarradiation\": 312.0,\n" +
                "                    \"solarenergy\": 1.1,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645491600,\n" +
                "                    \"temp\": 63.7,\n" +
                "                    \"feelslike\": 63.7,\n" +
                "                    \"humidity\": 88.5,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 73.8,\n" +
                "                    \"solarradiation\": 208.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645495200,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 90.6,\n" +
                "                    \"dew\": 60.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 86.9,\n" +
                "                    \"solarradiation\": 104.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645498800,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 92.63,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.2,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645502400,\n" +
                "                    \"temp\": 61.9,\n" +
                "                    \"feelslike\": 61.9,\n" +
                "                    \"humidity\": 93.2,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.6,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-22\",\n" +
                "            \"datetimeEpoch\": 1645506000,\n" +
                "            \"tempmax\": 76.7,\n" +
                "            \"tempmin\": 60.7,\n" +
                "            \"temp\": 66.3,\n" +
                "            \"feelslikemax\": 76.7,\n" +
                "            \"feelslikemin\": 60.7,\n" +
                "            \"feelslike\": 66.3,\n" +
                "            \"dew\": 59.8,\n" +
                "            \"humidity\": 82.2,\n" +
                "            \"precip\": 0.43,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 2.7,\n" +
                "            \"windspeed\": 2.9,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.3,\n" +
                "            \"cloudcover\": 81.1,\n" +
                "            \"visibility\": 12.5,\n" +
                "            \"solarradiation\": 207.6,\n" +
                "            \"solarenergy\": 6.0,\n" +
                "            \"uvindex\": 7.0,\n" +
                "            \"severerisk\": 10.0,\n" +
                "            \"sunrise\": \"06:16:51\",\n" +
                "            \"sunriseEpoch\": 1645528611,\n" +
                "            \"sunset\": \"18:14:47\",\n" +
                "            \"sunsetEpoch\": 1645571687,\n" +
                "            \"moonphase\": 0.67,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with a chance of rain throughout the day.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645506000,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 93.8,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645509600,\n" +
                "                    \"temp\": 61.6,\n" +
                "                    \"feelslike\": 61.6,\n" +
                "                    \"humidity\": 94.42,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645513200,\n" +
                "                    \"temp\": 61.3,\n" +
                "                    \"feelslike\": 61.3,\n" +
                "                    \"humidity\": 95.2,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 88.9,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.8,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.5,\n" +
                "                    \"cloudcover\": 94.6,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645516800,\n" +
                "                    \"temp\": 61.0,\n" +
                "                    \"feelslike\": 61.0,\n" +
                "                    \"humidity\": 96.0,\n" +
                "                    \"dew\": 59.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 77.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.1,\n" +
                "                    \"cloudcover\": 89.2,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645520400,\n" +
                "                    \"temp\": 60.7,\n" +
                "                    \"feelslike\": 60.7,\n" +
                "                    \"humidity\": 96.85,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 13.6,\n" +
                "                    \"cloudcover\": 83.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645524000,\n" +
                "                    \"temp\": 60.8,\n" +
                "                    \"feelslike\": 60.8,\n" +
                "                    \"humidity\": 96.4,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 12.1,\n" +
                "                    \"cloudcover\": 81.4,\n" +
                "                    \"solarradiation\": 0.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645527600,\n" +
                "                    \"temp\": 61.0,\n" +
                "                    \"feelslike\": 61.0,\n" +
                "                    \"humidity\": 96.0,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.8,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 10.6,\n" +
                "                    \"cloudcover\": 79.1,\n" +
                "                    \"solarradiation\": 0.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645531200,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 95.62,\n" +
                "                    \"dew\": 59.8,\n" +
                "                    \"precip\": 0.09,\n" +
                "                    \"precipprob\": 66.7,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 9.1,\n" +
                "                    \"cloudcover\": 76.7,\n" +
                "                    \"solarradiation\": 1.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645534800,\n" +
                "                    \"temp\": 62.6,\n" +
                "                    \"feelslike\": 62.6,\n" +
                "                    \"humidity\": 91.7,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 71.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.4,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 10.9,\n" +
                "                    \"cloudcover\": 77.3,\n" +
                "                    \"solarradiation\": 49.3,\n" +
                "                    \"solarenergy\": 0.2,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645538400,\n" +
                "                    \"temp\": 64.1,\n" +
                "                    \"feelslike\": 64.1,\n" +
                "                    \"humidity\": 87.7,\n" +
                "                    \"dew\": 60.3,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 76.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.0,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 12.6,\n" +
                "                    \"cloudcover\": 77.9,\n" +
                "                    \"solarradiation\": 97.7,\n" +
                "                    \"solarenergy\": 0.3,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645542000,\n" +
                "                    \"temp\": 65.6,\n" +
                "                    \"feelslike\": 65.6,\n" +
                "                    \"humidity\": 83.77,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.06,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 78.5,\n" +
                "                    \"solarradiation\": 146.0,\n" +
                "                    \"solarenergy\": 0.5,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645545600,\n" +
                "                    \"temp\": 69.3,\n" +
                "                    \"feelslike\": 69.3,\n" +
                "                    \"humidity\": 73.5,\n" +
                "                    \"dew\": 59.7,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.6,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 14.6,\n" +
                "                    \"cloudcover\": 69.1,\n" +
                "                    \"solarradiation\": 216.7,\n" +
                "                    \"solarenergy\": 0.8,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645549200,\n" +
                "                    \"temp\": 72.9,\n" +
                "                    \"feelslike\": 72.9,\n" +
                "                    \"humidity\": 63.3,\n" +
                "                    \"dew\": 59.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.6,\n" +
                "                    \"windspeed\": 2.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 59.8,\n" +
                "                    \"solarradiation\": 287.3,\n" +
                "                    \"solarenergy\": 1.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645552800,\n" +
                "                    \"temp\": 76.6,\n" +
                "                    \"feelslike\": 76.6,\n" +
                "                    \"humidity\": 53.08,\n" +
                "                    \"dew\": 58.2,\n" +
                "                    \"precip\": 0.01,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 50.4,\n" +
                "                    \"solarradiation\": 358.0,\n" +
                "                    \"solarenergy\": 1.3,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645556400,\n" +
                "                    \"temp\": 76.6,\n" +
                "                    \"feelslike\": 76.6,\n" +
                "                    \"humidity\": 52.7,\n" +
                "                    \"dew\": 58.1,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 57.9,\n" +
                "                    \"solarradiation\": 485.0,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645560000,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 52.4,\n" +
                "                    \"dew\": 57.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 65.4,\n" +
                "                    \"solarradiation\": 612.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645563600,\n" +
                "                    \"temp\": 76.7,\n" +
                "                    \"feelslike\": 76.7,\n" +
                "                    \"humidity\": 52.08,\n" +
                "                    \"dew\": 57.8,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1006.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 72.9,\n" +
                "                    \"solarradiation\": 739.0,\n" +
                "                    \"solarenergy\": 2.7,\n" +
                "                    \"uvindex\": 7.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645567200,\n" +
                "                    \"temp\": 72.8,\n" +
                "                    \"feelslike\": 72.8,\n" +
                "                    \"humidity\": 63.7,\n" +
                "                    \"dew\": 58.9,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.1,\n" +
                "                    \"windspeed\": 2.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.3,\n" +
                "                    \"visibility\": 11.4,\n" +
                "                    \"cloudcover\": 81.9,\n" +
                "                    \"solarradiation\": 631.7,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645570800,\n" +
                "                    \"temp\": 68.9,\n" +
                "                    \"feelslike\": 68.9,\n" +
                "                    \"humidity\": 75.4,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.7,\n" +
                "                    \"windspeed\": 1.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.7,\n" +
                "                    \"visibility\": 7.8,\n" +
                "                    \"cloudcover\": 91.0,\n" +
                "                    \"solarradiation\": 524.3,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645574400,\n" +
                "                    \"temp\": 65.0,\n" +
                "                    \"feelslike\": 65.0,\n" +
                "                    \"humidity\": 87.01,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.13,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.3,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 4.2,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 417.0,\n" +
                "                    \"solarenergy\": 1.5,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645578000,\n" +
                "                    \"temp\": 64.3,\n" +
                "                    \"feelslike\": 64.3,\n" +
                "                    \"humidity\": 89.5,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 96.8,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 7.4,\n" +
                "                    \"cloudcover\": 95.6,\n" +
                "                    \"solarradiation\": 278.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645581600,\n" +
                "                    \"temp\": 63.6,\n" +
                "                    \"feelslike\": 63.6,\n" +
                "                    \"humidity\": 92.0,\n" +
                "                    \"dew\": 61.2,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 10.7,\n" +
                "                    \"cloudcover\": 91.1,\n" +
                "                    \"solarradiation\": 139.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645585200,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 94.45,\n" +
                "                    \"dew\": 61.2,\n" +
                "                    \"precip\": 0.08,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.3,\n" +
                "                    \"windspeed\": 1.6,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 86.7,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645588800,\n" +
                "                    \"temp\": 62.6,\n" +
                "                    \"feelslike\": 62.6,\n" +
                "                    \"humidity\": 94.6,\n" +
                "                    \"dew\": 61.0,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 13.8,\n" +
                "                    \"cloudcover\": 89.9,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"datetime\": \"2022-02-23\",\n" +
                "            \"datetimeEpoch\": 1645592400,\n" +
                "            \"tempmax\": 78.5,\n" +
                "            \"tempmin\": 61.1,\n" +
                "            \"temp\": 66.1,\n" +
                "            \"feelslikemax\": 78.5,\n" +
                "            \"feelslikemin\": 61.1,\n" +
                "            \"feelslike\": 66.1,\n" +
                "            \"dew\": 60.9,\n" +
                "            \"humidity\": 84.9,\n" +
                "            \"precip\": 0.5,\n" +
                "            \"precipprob\": 100.0,\n" +
                "            \"precipcover\": null,\n" +
                "            \"preciptype\": [\n" +
                "                \"rain\"\n" +
                "            ],\n" +
                "            \"snow\": null,\n" +
                "            \"snowdepth\": 0.0,\n" +
                "            \"windgust\": 3.6,\n" +
                "            \"windspeed\": 2.9,\n" +
                "            \"winddir\": null,\n" +
                "            \"pressure\": 1011.4,\n" +
                "            \"cloudcover\": 89.2,\n" +
                "            \"visibility\": 13.0,\n" +
                "            \"solarradiation\": 232.9,\n" +
                "            \"solarenergy\": 6.7,\n" +
                "            \"uvindex\": 6.0,\n" +
                "            \"severerisk\": 30.0,\n" +
                "            \"sunrise\": \"06:16:33\",\n" +
                "            \"sunriseEpoch\": 1645614993,\n" +
                "            \"sunset\": \"18:14:49\",\n" +
                "            \"sunsetEpoch\": 1645658089,\n" +
                "            \"moonphase\": 0.73,\n" +
                "            \"conditions\": \"Rain, Partially cloudy\",\n" +
                "            \"description\": \"Partly cloudy throughout the day with storms possible.\",\n" +
                "            \"icon\": \"rain\",\n" +
                "            \"stations\": null,\n" +
                "            \"source\": \"fcst\",\n" +
                "            \"hours\": [\n" +
                "                {\n" +
                "                    \"datetime\": \"00:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645592400,\n" +
                "                    \"temp\": 62.4,\n" +
                "                    \"feelslike\": 62.4,\n" +
                "                    \"humidity\": 94.8,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.2,\n" +
                "                    \"windspeed\": 1.1,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 13.8,\n" +
                "                    \"cloudcover\": 93.1,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"01:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645596000,\n" +
                "                    \"temp\": 62.1,\n" +
                "                    \"feelslike\": 62.1,\n" +
                "                    \"humidity\": 95.03,\n" +
                "                    \"dew\": 60.7,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 90.5,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 0.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 13.7,\n" +
                "                    \"cloudcover\": 96.3,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"02:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645599600,\n" +
                "                    \"temp\": 61.8,\n" +
                "                    \"feelslike\": 61.8,\n" +
                "                    \"humidity\": 95.4,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 79.4,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 97.5,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"03:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645603200,\n" +
                "                    \"temp\": 61.5,\n" +
                "                    \"feelslike\": 61.5,\n" +
                "                    \"humidity\": 95.8,\n" +
                "                    \"dew\": 60.4,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 68.2,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.0,\n" +
                "                    \"windspeed\": 0.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.4,\n" +
                "                    \"cloudcover\": 98.8,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"04:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645606800,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 96.24,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 0.9,\n" +
                "                    \"windspeed\": 0.7,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"05:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645610400,\n" +
                "                    \"temp\": 61.2,\n" +
                "                    \"feelslike\": 61.2,\n" +
                "                    \"humidity\": 96.4,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.8,\n" +
                "                    \"windspeed\": 0.5,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.7,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 98.5,\n" +
                "                    \"solarradiation\": 0.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"06:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645614000,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 96.7,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.8,\n" +
                "                    \"windspeed\": 0.4,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1013.3,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 97.0,\n" +
                "                    \"solarradiation\": 1.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"07:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645617600,\n" +
                "                    \"temp\": 61.1,\n" +
                "                    \"feelslike\": 61.1,\n" +
                "                    \"humidity\": 96.86,\n" +
                "                    \"dew\": 60.2,\n" +
                "                    \"precip\": 0.02,\n" +
                "                    \"precipprob\": 57.1,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 0.7,\n" +
                "                    \"windspeed\": 0.2,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 95.5,\n" +
                "                    \"solarradiation\": 2.0,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"08:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645621200,\n" +
                "                    \"temp\": 63.1,\n" +
                "                    \"feelslike\": 63.1,\n" +
                "                    \"humidity\": 92.0,\n" +
                "                    \"dew\": 60.6,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 65.1,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.1,\n" +
                "                    \"windspeed\": 1.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.8,\n" +
                "                    \"cloudcover\": 73.3,\n" +
                "                    \"solarradiation\": 93.3,\n" +
                "                    \"solarenergy\": 0.3,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"09:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645624800,\n" +
                "                    \"temp\": 65.0,\n" +
                "                    \"feelslike\": 65.0,\n" +
                "                    \"humidity\": 87.1,\n" +
                "                    \"dew\": 61.0,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 73.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.4,\n" +
                "                    \"windspeed\": 1.7,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 14.9,\n" +
                "                    \"cloudcover\": 51.2,\n" +
                "                    \"solarradiation\": 184.7,\n" +
                "                    \"solarenergy\": 0.7,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"10:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645628400,\n" +
                "                    \"temp\": 67.0,\n" +
                "                    \"feelslike\": 67.0,\n" +
                "                    \"humidity\": 82.28,\n" +
                "                    \"dew\": 61.4,\n" +
                "                    \"precip\": 0.03,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.8,\n" +
                "                    \"windspeed\": 2.5,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1014.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 29.0,\n" +
                "                    \"solarradiation\": 276.0,\n" +
                "                    \"solarenergy\": 1.0,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"11:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645632000,\n" +
                "                    \"temp\": 70.8,\n" +
                "                    \"feelslike\": 70.8,\n" +
                "                    \"humidity\": 72.5,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 1.9,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.3,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 52.7,\n" +
                "                    \"solarradiation\": 386.3,\n" +
                "                    \"solarenergy\": 1.4,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"12:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645635600,\n" +
                "                    \"temp\": 74.7,\n" +
                "                    \"feelslike\": 74.7,\n" +
                "                    \"humidity\": 62.8,\n" +
                "                    \"dew\": 60.5,\n" +
                "                    \"precip\": 0.0,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.1,\n" +
                "                    \"windspeed\": 2.8,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1010.7,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 76.3,\n" +
                "                    \"solarradiation\": 496.7,\n" +
                "                    \"solarenergy\": 1.8,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Partially cloudy\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"13:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645639200,\n" +
                "                    \"temp\": 78.5,\n" +
                "                    \"feelslike\": 78.5,\n" +
                "                    \"humidity\": 53.02,\n" +
                "                    \"dew\": 60.0,\n" +
                "                    \"precip\": 0.04,\n" +
                "                    \"precipprob\": 81.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.9,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 15.0,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 607.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"14:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645642800,\n" +
                "                    \"temp\": 76.2,\n" +
                "                    \"feelslike\": 76.2,\n" +
                "                    \"humidity\": 59.8,\n" +
                "                    \"dew\": 60.9,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 87.3,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.6,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.3,\n" +
                "                    \"visibility\": 14.7,\n" +
                "                    \"cloudcover\": 97.5,\n" +
                "                    \"solarradiation\": 615.0,\n" +
                "                    \"solarenergy\": 2.2,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"15:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645646400,\n" +
                "                    \"temp\": 74.0,\n" +
                "                    \"feelslike\": 74.0,\n" +
                "                    \"humidity\": 66.5,\n" +
                "                    \"dew\": 61.8,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 93.7,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.3,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1007.7,\n" +
                "                    \"visibility\": 14.3,\n" +
                "                    \"cloudcover\": 95.0,\n" +
                "                    \"solarradiation\": 623.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"16:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645650000,\n" +
                "                    \"temp\": 71.7,\n" +
                "                    \"feelslike\": 71.7,\n" +
                "                    \"humidity\": 73.3,\n" +
                "                    \"dew\": 62.7,\n" +
                "                    \"precip\": 0.12,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 3.6,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1007.0,\n" +
                "                    \"visibility\": 14.0,\n" +
                "                    \"cloudcover\": 92.5,\n" +
                "                    \"solarradiation\": 631.0,\n" +
                "                    \"solarenergy\": 2.3,\n" +
                "                    \"uvindex\": 6.0,\n" +
                "                    \"severerisk\": 30.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"17:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645653600,\n" +
                "                    \"temp\": 69.3,\n" +
                "                    \"feelslike\": 69.3,\n" +
                "                    \"humidity\": 78.4,\n" +
                "                    \"dew\": 62.2,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 3.1,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1008.0,\n" +
                "                    \"visibility\": 10.4,\n" +
                "                    \"cloudcover\": 95.0,\n" +
                "                    \"solarradiation\": 536.3,\n" +
                "                    \"solarenergy\": 1.9,\n" +
                "                    \"uvindex\": 5.0,\n" +
                "                    \"severerisk\": 23.3,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"18:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645657200,\n" +
                "                    \"temp\": 66.9,\n" +
                "                    \"feelslike\": 66.9,\n" +
                "                    \"humidity\": 83.5,\n" +
                "                    \"dew\": 61.6,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.7,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1009.0,\n" +
                "                    \"visibility\": 6.8,\n" +
                "                    \"cloudcover\": 97.5,\n" +
                "                    \"solarradiation\": 441.7,\n" +
                "                    \"solarenergy\": 1.6,\n" +
                "                    \"uvindex\": 4.0,\n" +
                "                    \"severerisk\": 16.7,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"19:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645660800,\n" +
                "                    \"temp\": 64.5,\n" +
                "                    \"feelslike\": 64.5,\n" +
                "                    \"humidity\": 88.67,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.13,\n" +
                "                    \"precipprob\": 100.0,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.2,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1010.0,\n" +
                "                    \"visibility\": 3.2,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 347.0,\n" +
                "                    \"solarenergy\": 1.2,\n" +
                "                    \"uvindex\": 3.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"20:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645664400,\n" +
                "                    \"temp\": 64.0,\n" +
                "                    \"feelslike\": 64.0,\n" +
                "                    \"humidity\": 90.4,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.3,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1011.0,\n" +
                "                    \"visibility\": 6.8,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 231.3,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 2.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"21:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645668000,\n" +
                "                    \"temp\": 63.4,\n" +
                "                    \"feelslike\": 63.4,\n" +
                "                    \"humidity\": 92.1,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.1,\n" +
                "                    \"precipprob\": 0.0,\n" +
                "                    \"snow\": 0.0,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": 2.4,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": 0.0,\n" +
                "                    \"pressure\": 1012.0,\n" +
                "                    \"visibility\": 10.3,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 115.7,\n" +
                "                    \"solarenergy\": 0.0,\n" +
                "                    \"uvindex\": 1.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Overcast\",\n" +
                "                    \"icon\": \"cloudy\",\n" +
                "                    \"stations\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"22:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645671600,\n" +
                "                    \"temp\": 62.9,\n" +
                "                    \"feelslike\": 62.9,\n" +
                "                    \"humidity\": 93.85,\n" +
                "                    \"dew\": 61.1,\n" +
                "                    \"precip\": 0.08,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": 0.0,\n" +
                "                    \"preciptype\": [\n" +
                "                        \"rain\"\n" +
                "                    ],\n" +
                "                    \"windgust\": 2.5,\n" +
                "                    \"windspeed\": 2.0,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": 1013.0,\n" +
                "                    \"visibility\": 13.9,\n" +
                "                    \"cloudcover\": 100.0,\n" +
                "                    \"solarradiation\": 0.0,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": 0.0,\n" +
                "                    \"severerisk\": 10.0,\n" +
                "                    \"conditions\": \"Rain, Overcast\",\n" +
                "                    \"icon\": \"rain\",\n" +
                "                    \"stations\": null,\n" +
                "                    \"source\": \"fcst\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"datetime\": \"23:00:00\",\n" +
                "                    \"datetimeEpoch\": 1645675200,\n" +
                "                    \"temp\": null,\n" +
                "                    \"feelslike\": null,\n" +
                "                    \"humidity\": null,\n" +
                "                    \"dew\": null,\n" +
                "                    \"precip\": null,\n" +
                "                    \"precipprob\": null,\n" +
                "                    \"snow\": null,\n" +
                "                    \"snowdepth\": null,\n" +
                "                    \"preciptype\": null,\n" +
                "                    \"windgust\": null,\n" +
                "                    \"windspeed\": null,\n" +
                "                    \"winddir\": null,\n" +
                "                    \"pressure\": null,\n" +
                "                    \"visibility\": null,\n" +
                "                    \"cloudcover\": null,\n" +
                "                    \"solarradiation\": null,\n" +
                "                    \"solarenergy\": null,\n" +
                "                    \"uvindex\": null,\n" +
                "                    \"conditions\": \"\",\n" +
                "                    \"icon\": \"\",\n" +
                "                    \"stations\": null\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"alerts\": [],\n" +
                "    \"stations\": {\n" +
                "        \"SKMD\": {\n" +
                "            \"distance\": 3348.0,\n" +
                "            \"latitude\": 6.22,\n" +
                "            \"longitude\": -75.59,\n" +
                "            \"useCount\": 0,\n" +
                "            \"id\": \"SKMD\",\n" +
                "            \"name\": \"SKMD\",\n" +
                "            \"quality\": 19,\n" +
                "            \"contribution\": 0.0\n" +
                "        },\n" +
                "        \"SKRG\": {\n" +
                "            \"distance\": 17603.0,\n" +
                "            \"latitude\": 6.18,\n" +
                "            \"longitude\": -75.43,\n" +
                "            \"useCount\": 0,\n" +
                "            \"id\": \"SKRG\",\n" +
                "            \"name\": \"SKRG\",\n" +
                "            \"quality\": 49,\n" +
                "            \"contribution\": 0.0\n" +
                "        }\n" +
                "    },\n" +
                "    \"currentConditions\": {\n" +
                "        \"datetime\": \"15:00:00\",\n" +
                "        \"datetimeEpoch\": 1644436800,\n" +
                "        \"temp\": 65.9,\n" +
                "        \"feelslike\": 65.9,\n" +
                "        \"humidity\": 93.3,\n" +
                "        \"dew\": 63.9,\n" +
                "        \"precip\": 0.02,\n" +
                "        \"precipprob\": null,\n" +
                "        \"snow\": null,\n" +
                "        \"snowdepth\": 0.0,\n" +
                "        \"preciptype\": null,\n" +
                "        \"windgust\": null,\n" +
                "        \"windspeed\": 3.4,\n" +
                "        \"winddir\": 223.0,\n" +
                "        \"pressure\": 1018.2,\n" +
                "        \"visibility\": 6.2,\n" +
                "        \"cloudcover\": 88.4,\n" +
                "        \"solarradiation\": 423.0,\n" +
                "        \"solarenergy\": 1.5,\n" +
                "        \"uvindex\": 0.0,\n" +
                "        \"conditions\": \"Rain, Partially cloudy\",\n" +
                "        \"icon\": \"rain\",\n" +
                "        \"stations\": [\n" +
                "            \"SKMD\",\n" +
                "            \"SKRG\"\n" +
                "        ],\n" +
                "        \"sunrise\": \"06:19:36\",\n" +
                "        \"sunriseEpoch\": 1644405576,\n" +
                "        \"sunset\": \"18:13:33\",\n" +
                "        \"sunsetEpoch\": 1644448413,\n" +
                "        \"moonphase\": 0.29\n" +
                "    }\n" +
                "}";
    }
}
