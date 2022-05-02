import React, { memo } from 'react'
import PropTypes from 'prop-types'
import { Card as CardUI } from '../../components'
import {
    LabelStyled,
    ValueSlyled,
    CardContentStyled
}   from './styled'

function Card({ value, label, color}) {
    return (
        <CardUI>
            <CardContentStyled color={color}>
                <ValuStyled>{value}</ValuStyled>
                <LabelStyled>{label}</LabelStyled>
            </CardContentStyled>
        </CardUI>
    )
}

export default memo(Card)