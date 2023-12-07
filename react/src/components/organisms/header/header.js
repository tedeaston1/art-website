import React, { Component } from "react";
import { HeaderLogo, StyledHeader } from "./style";
import Button from "../../atoms/button/button";
import Logo from "../../atoms/logo/logo";

export default class Header extends Component {
    constructor(props){
        super(props);
    }

    render() {
        return(
            <StyledHeader>
                <HeaderLogo>
                    <Logo/>
                </HeaderLogo>
            </StyledHeader>
        )

    }

}