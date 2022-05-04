import React, { memo } from 'react'
import PropTypes from 'prop-types'
import { Grid, Skeleton } from '../../../components'
import Card from './Card'

function Board({ data }) {
    const { cases, todayDeaths, recovered, deaths, todayCases } = data

    const getValue = (value) => value ? value : <Skeleton variant="text" width={182} height={60} />
    
    return (
        <Grid container spacing={4}>
          <Grid item xs={12} md={3}>
            <Card value={getValue(cases)} label="Total de Casos" color="#77ff5d" />
          </Grid>

          <Grid item xs={12} md={3}>
            <Card value={getValue(todayDeaths)} label="Óbitos hoje" color="#00CED1" />
          </Grid>

          <Grid item xs={12} md={3}>
            <Card value={getValue(todayCases)} label="Casos hoje" color="#00FF7F" />
          </Grid>

          <Grid item xs={12} md={3}>
            <Card value={getValue(deaths)} label="Total de mortos" color="#000" />
          </Grid>

          <Grid item xs={12} md={3}>
            <Card value={getValue(recovered)} label="Total recuperados" color="	#4F4F4F" />
          </Grid>
        </Grid>
    )
}

export default memo(Board)