import React from 'react';
import {Link} from 'react-router';

export default class Login extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div>
                <div className="jumbotron text-center">
                    <h1>Dashboard</h1>
                    <div className="td-2 c title">
                        Wallet
                    </div>
                    <div className="td-2 c b">100 000  HUF</div>

                    <div className="td-2 c title newline">
                        Investments <a href="/investments"><span className="glyphicon glyphicon-th-list"></span></a>
                    </div>
                    <div className="td-2 c b">1 pc</div>

                    <div className="td-2 c title newline">
                        Shareholds <a href="/shareholds"><span className="glyphicon glyphicon-th-list"></span></a>
                    </div>
                    <div className="td-2 c b">1 pc</div>


                    <div className="td-2 c title newline">
                        Your monthly income
                    </div>
                    <div className="td-2 c b">2080 HUF</div>

                    <div className="td-2 newline title">
                        Your tenants reliability:
                    </div>
                    <div className="td-2 b c">
                        99.8%
                    </div>
                </div>
            </div>
        );
    }
}