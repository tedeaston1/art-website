import React, { Component, useState } from "react";
import { NavBarContainer, StyledSidebar } from "./style";
import NavBar from "../../molecules/navbar/navbar";
import { navBarItems } from "../../molecules/navbar/navBarItems";

export default class Sidebar extends Component {
    constructor(props){
        super(props);
    }

    render(){
        return(
            <StyledSidebar>
                <NavBar navBarItems={navBarItems}/>
            </StyledSidebar>
        )
    }

}