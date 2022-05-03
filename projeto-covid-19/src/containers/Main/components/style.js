import styled from 'styled-components'
import { Typography, CardContent } from '../../../components'

//Criação dos components
export const LabelStyled = styled(Typography)`
    font-weight: 500;
    font-size: 1.5rem;
`

export const ValueStyled = styled(Typography)`
    font-weight: 400;
    font-size: 2.5rem;
`
export const CardContentStyled = styled(CardContent)`
    border-left: 8px solid ${({ color }) => color || '#77ff5d'};
`

export const CardPanelContentStyled = styled(CardContent)`
    display: flex;
    justify-content: space-between;
    padding: 25px;
`

export const ItemStyled = styled.div`
    display: flex;
    justify-content: space-between;
    min-widht: 150px;
`