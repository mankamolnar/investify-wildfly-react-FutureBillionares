import React from 'react';
import {Link} from 'react-router';
import NavBar from '../components/NavBar';
import FaqPage from "../components/FaqPage";

export default class Faq extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loggedIn:this.props.loggedIn};
    }

    render() {
        return (
            <div>
                <NavBar loggedIn={this.state.loggedIn} />
                <FaqPage/>
            </div>
        );
    }
}