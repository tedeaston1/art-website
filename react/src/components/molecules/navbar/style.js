import styled from 'styled-components'


const StyledNavBar = styled.ul`
    display: block;
    justify-content: space-around;
    min-width: 25%;
    position: relative;
    margin: 0px;
    padding-left: 0.75rem;
    
    :hover {
        transform: translateX(+5px);    
    }
   
    `;

const NavBarItem = styled.li`
    font-size: 1.3rem;
    transition: .5s ease-in-out;
    position: relative;
    list-style-type: none;
    font-family: 'Super Cool';
    text-shadow: 1px 1px 0px white,
                    2px 2px 0px white,
                    3px 3px 1px grey;
`

export {StyledNavBar, NavBarItem};