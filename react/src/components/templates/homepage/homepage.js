import React, { Component, Fragment } from "react";
import { MainContainer } from "./style";
import Header from "../../organisms/header/header";
import { navBarItems } from "../../molecules/navbar/navBarItems";
import Sidebar from "../../organisms/sidebar/sidebar";

export default class Homepage extends Component {
    constructor(props){
        super(props);
    };

    render() {
        return(
            <Fragment>
                <MainContainer>
                    <Header navBarItems={navBarItems}></Header>
                    <Sidebar></Sidebar>
                </MainContainer>
            </Fragment>
        )
    }
}
