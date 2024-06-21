FROM node:20-bookworm-slim

# Install dependencies for Puppeteer
RUN apt-get update && apt-get install -y \
    wget \
    gnupg \
    ca-certificates \
    && apt-get install -y chromium \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*


# Install Puppeteer globally
RUN npm install -g puppeteer

# Print Chromium version
RUN chromium --version

# Set the working directory to /
# Define working directory
WORKDIR /

# Copy package.json and package-lock.json
COPY package*.json ./

# Install npm dependencies
RUN npm install

# Copy application code
COPY . .

# Expose port
EXPOSE 3000

# Start the application
CMD ["npm", "start"]
