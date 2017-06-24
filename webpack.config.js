/**
 *
 * Created by flowerpower on 2017. 06. 13..
 */
var webpack = require('webpack');
var path = require('path');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

module.exports = {
    entry: "./src/resources/react/router.jsx",
    output: {
        path: __dirname + '/static/',
        filename: "bundle.js"
    },
    resolve: {
        extensions: ['', '.js', '.jsx']
    },
    module: {
        loaders: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                // include: [
                //     path.resolve(__dirname, "./src/main/resources/react")
                // ],
                loader: 'babel',
                query: {
                    presets: ['es2015', 'react']
                }
            }
        ]
    },
    plugins: [
        new ExtractTextPlugin("[name].css")
    ]
};
