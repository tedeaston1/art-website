import styled from 'styled-components'

const StyledHeader = styled.header`
    position: absolute;
    display: flex;
    box-sizing: border-box;
    justify-content: center;
    width: 100%;
    z-index: 3;
    transition: padding 0.2s linear, background-color 0.2s linear;
    position: fixed;
    top: 0;
    background: #papayawhip; 
    column-count: 3;
    z-index: 0;
`;

const HeaderLogo = styled.div`
    width: fit-content;
    padding: 0.5rem;
    position: relative;
    font-family: 'Super Cool';
`

export {StyledHeader, HeaderLogo};