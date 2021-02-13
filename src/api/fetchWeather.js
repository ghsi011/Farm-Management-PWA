import axios from 'axios'

const URL = 'https://api.openweathermap.org/data/2.5/weather';
const API_KEY = 'eed948029d6f092a632ff167a9d8b554';

export const fetchWeather = async (query) => {
    const axios_parms = {
        params: {
            q: query,
            units: 'metric',
            APPID: API_KEY,
        }
    }

    const { data } = await axios.get(URL, axios_parms);

    return data;
}