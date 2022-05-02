import React, { memo, useCallback, useEffect, useState } from 'react'
import Api from '../../api'

function Main() {
    const [data, setData] = useState({})
    const [country, setCountry] = useState('brazil')

    const getCovidData = useCallback((country) => {
        Api.getCountry(country)
            .then(data => setData(data))
    }, [])

    useEffect(() => {    
        getCovidData(country)
    },   [getCovidData, country])

    return (
        <div>
            Projeto Covid 19
        </div>
    )
}

export default memo(Main)