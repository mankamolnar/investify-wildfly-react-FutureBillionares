import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import FaqPage from "../components/FaqPage";
// *** PAGES ***
export default class Faq extends React.Component {
    constructor() {
        super();
        this.state = {loggedIn:false};
        this.changeState = this.changeState.bind(this)
    }

    changeState() {
        console.log(this.state.loggedIn);
        this.setState({loggedIn:!this.state.loggedIn});
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} changeState={this.changeState} />
                <FaqPage/>
            </div>
        );
    }
}