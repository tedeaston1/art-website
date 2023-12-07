import React, { Component } from "react";
import { StyledNavBar, NavBarItem, NavContainer } from "./style";
import Link from "../../atoms/link/link";

export default class NavBar extends Component {
    render() {
        const {navBarItems} = this.props

        return (
            <StyledNavBar>
                {navBarItems.map(navBarItem => {
                    return <NavBarItem><Link href={navBarItem.route|| '#'}>{navBarItem.name}</Link></NavBarItem>
                })}
            </StyledNavBar>
        )
    }
}