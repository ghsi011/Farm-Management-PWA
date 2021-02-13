import React, {useState} from 'react';

import {fetchWeather} from './api/fetchWeather';
import './App.css';

const App = () => {
    const  [query, setQuery] = useState('')

    const search = async (event) => {
        if(event.key == 'Enter'){
            const data = await fetchWeather(query)

            console.log(data)
        }
    }

    return (
        <div className="main-container">
            <input
                type="text"
                className="search"
                placeholder="search ..."
                value={query}
                onChange={(e) => setQuery(e.target.value)}
                onKeyPress={search}
            />
        </div>
    );
}

export default App;