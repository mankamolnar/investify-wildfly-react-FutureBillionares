import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import FaqPage from "../components/FaqPage";
// *** PAGES ***

export default class Faq extends React.Component {
    constructor(props) {
        super(props);
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